object soomemath {

  def gcd(x: Integer, y:Integer): Integer = {
    if (y == 0) x else gcd(y, x%y)
  }

  def factorial(x: Integer): Integer = {
    if (x==0) 1 else (x*factorial(x-1))
  }

  def main(args: Array[String]) {
    println(gcd(48,18))
    println(factorial(5))
  }

}
