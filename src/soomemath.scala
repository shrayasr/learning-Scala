object soomemath {

  def gcd(x: Integer, y:Integer): Integer = {
    if (y == 0) x else gcd(y, x%y)
  }

  def factorial(x: Integer): Integer = {
    if (x==0) 1 else (x*factorial(x-1))
  }

  def better_factorial(x: Integer): Integer = {
    def loop(acc: Integer, n: Integer): Integer = {
      if (n==0) acc
      else loop(acc*n, n-1)
    }
    loop(1, x)
  }

  def fib(n: Integer): String = {
    def fibIter(series: String, a:Integer, b:Integer): String = {
      val c = a+b
      val newSeries = series + " " + c
      if (c>=n) series
      else fibIter(newSeries, b, c)
    }
    fibIter("0 1",0,1)
  }

  def main(args: Array[String]) {
    println(gcd(48,18))
    println(factorial(5))
    println(better_factorial(5))
    println(fib(5))
  }

}
