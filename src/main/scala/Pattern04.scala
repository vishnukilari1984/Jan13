object Pattern04 {
  def main(args:Array[String]):Unit={

    for (i <- 5 to 1 by -1)
    {
      for (j <- 1 to i by 1) {
        print("*" +" ")

      }
      println()

    }

  }
}
