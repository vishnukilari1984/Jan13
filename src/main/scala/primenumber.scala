object primenumber {
  def main(args:Array[String]):Unit={
    var num=47
    var count=0
    for (i<- 1 to 47 by 1)
      {
        if (num%i == 0)
          {
            count=count+1
          }
      }
if (count <= 2)
  {
    print("Its a Prime number")
  }
else
  {
    print("its not a prime number")
  }
  }
}
