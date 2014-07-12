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

  def main(args: Array[String]) {
    pascalsTriangle
  }

}
