object soomemath {

  def gcd(x: Integer, y:Integer): Integer = {
    if (y == 0) x else gcd(y, x%y)
  }

  def main(args: Array[String]) {
    println(gcd(48,18))
  }

}
