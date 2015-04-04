import scala.concurrent._
import ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object futures {

  def something() = {
    Thread.sleep(2000)
    "Hello"
  }

  def main(args: Array[String]) {

    val f: Future[String] = Future {
      something()
    }

    println("async yo!")

    f onComplete {
      case Success(res) => println(res)
      case Failure(t) => println("ERRORZZ")
    }

    Thread.sleep(6000)
  }
}
