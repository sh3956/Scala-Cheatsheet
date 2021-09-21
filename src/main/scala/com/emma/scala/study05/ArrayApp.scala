package com.emma.scala.study05

object ArrayApp extends App{
//  val a = new Array[String](5)
//  println(a.length)
//  a(1) = "hello"
//  val b = Array("hadoop", "spark", "storm")
//  val c = Array(2,3,4,5,6,7,8)
//
//  println(c.mkString(","))
  val c = scala.collection.mutable.ArrayBuffer[Int]()
  c += 1
  c += 2
  c += (3,4,5)
  c ++= Array(6,7,8)
  c.insert(0, 0)
  c.remove(1)
  c.remove(0, 3)
  c.trimEnd(2)
  //c.toArray
  for(i <- (0 until c.length).reverse){
    println(c(i))
  }
  for(ele <- c){
    println(ele)
  }
}
