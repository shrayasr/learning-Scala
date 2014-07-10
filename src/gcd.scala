object gcd {

  def calc_gcd(x: Integer, y:Integer): Integer = {
    if (y == 0) x else calc_gcd(y, x%y)
  }

  def main(args: Array[String]) {
    println(calc_gcd(48,18))
  }

}
