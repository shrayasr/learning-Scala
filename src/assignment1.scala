object assignment1 {

  def pascalsTriangle = {

    for (row <- 0 to 10) {
      for (col <- 0 to row) {
        print(pascal(col, row) + " ")
      }
      println()
    }

    def pascal(c: Int, r:Int):Int = {
      if (c==0) 1
      else if (c==r) 1
      else pascal(c-1,r-1) + pascal(c,r-1)
    }
  }

  def balance(chars: List[Char]): Boolean = {

    def balanceIter(accCount: Integer, chars: List[Char]): Integer = {
      if (chars.isEmpty) accCount
      else if (chars.head == '(') balanceIter(accCount+1, chars.tail)
      else if (chars.head == ')' && accCount==0) 1
      else if (chars.head == ')' && accCount>0) balanceIter(accCount-1, chars.tail)
      else balanceIter(accCount, chars.tail)
    }

    balanceIter(0, chars) == 0
  }

  def main(args: Array[String]) {
    //pascalsTriangle

    val string1 = "(if (zero? x) max (/ 1 x))"
    val string2 = "I told him (that it’s not (yet) done). (But he wasn’t listening)"
    val string3 = ":-)"
    val string4 = "())("

    print(balance(string1.toList))
    print(balance(string2.toList))
    print(balance(string3.toList))
    print(balance(string4.toList))
  }

}
