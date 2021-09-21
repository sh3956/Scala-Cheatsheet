package com.emma.scala.study05

object TupleApp extends App {
  val a = (1, 2, 3, 4, 5)
  a._1 // 1
  a._2 // 2

  // iteration
  for (i <- 0 until (a.productArity)) {
    println(a.productElement(i))
  }
  // 1, 2, 3, 4, 5

  val hostPort = ("localhost", 8080)
  hostPort._1
  hostPort._2

}
