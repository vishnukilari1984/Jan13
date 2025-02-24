object FabinnociSeries {
  def main(args:Array[String]):Unit={
    var a=0
    var b=1
    var c=0
    print(a)
    print(" " + b + " ")
    for (i<-1 to 20 by 1)
      {
        c=a+b
        print(c +" ")
        a=b
        b=c

      }

  }
}
