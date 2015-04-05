import org.json4s._
import org.json4s.native.JsonMethods._

case class Person(name: String, age: Int, likes: List[String])

object json_parsing {

  def main(args: Array[String]): Unit = {

    implicit val formats = DefaultFormats

    val json = parse(""" {"name": "Shrayas", "age": 25, "likes": ["travelling", "cardistry"]} """)

    val jsonParsed = json.extract[Person]

    println(jsonParsed.name)
    println(jsonParsed.age)
    println(jsonParsed.likes)

  }
}
