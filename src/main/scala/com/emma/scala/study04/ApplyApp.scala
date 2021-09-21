package com.emma.scala.study04

object ApplyApp {
  def main(args: Array[String]): Unit = {
//    for(i <- 1 to 10) {
//      ApplyTest.incr
//    }
//    print(ApplyTest.count)
    val b = ApplyTest() //-> object.apply
    print("------")
    val c = new ApplyTest()
    print(c)
    c()
  }

}

class ApplyTest{
  def apply() = {
    println("Class ApplyTest apply...")
  }
}

object ApplyTest{
  println("Object ApplyTest enter...")
  var count = 0
  def incr = {
    count = count + 1
  }
  // 最佳：在object new class
  def apply() = {
    println("Object ApplyTest apply...")
    // new class
    new ApplyTest
  }
  println("Object ApplyTest leave...")
}
