package com.emma.scala.study05

object ListApp extends App{
  val l = List(1,2,3,4,5)
  println(l.head, l.tail) // list in scala is composed of a head and a list of tails
  // output (1, List(2, 3, 4, 5))

  val l2 = 1 :: Nil // create a list
  println(l2) // List(1)

  val l3 = 2 :: l2
  println(l3) // List(2, 1)

  val l4 = 1 :: 2 :: 3 :: Nil
  println(l4) // List(1, 2, 3)

  val l5 = scala.collection.mutable.ListBuffer[Int]()
  l5 += 2
  l5 ++= List(6,7,8,9)
  l5 -= (1, 2) // no error message
  println(l5) // ListBuffer(6,7,8,9)
  println(l5.isEmpty) // false

//  l5.toList
//  l5.toArray

  def sum(nums: Int*):Int = {
    if (nums.length == 0){
      0
    } else{
      nums.head + sum(nums.tail:_*)
    }
  }
  println(sum(1,2,3,4)) // 10
}
