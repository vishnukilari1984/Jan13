object printnumberinreverse {
    def main(args:Array[String]):Unit={
      var num =123
      var rev=0
      var ral=0
      while (num != 0)
      {
        rev=num%10
        ral=rev + ral*10
        num=num/10
      }
      print(ral)
    }
}
