package com.emma.scala.study06

object ExceptionApp extends App {

  //IO
  val file = "test.txt"

  try {
    // open file
    // use file
    val i = 10/0
  } catch {
    case e: ArithmeticException => println("divider can not be zero")
    case e: Exception => println(e.getMessage)
  } finally {
    // need: close file, release resources
  }

}
