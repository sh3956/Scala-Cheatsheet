package com.emma.scala.study07

/**
 *  anonymous function: can define a name or not
 */
object FunctionApp extends App {

  def sayHello(name:String): Unit={
    println("Hi: " +name)
  }

  {(x:Int) => println("Hello: " +x)}
  (x:Int) => println("Hello: " +x)

  val m1 = (x:Int) => x+1 // pass an anonymous function to value
  println(m1(10)) // 11

  def add(x:Int, y:Int) = {x+y}

  def add = (x:Int, y:Int)=>{x+y} // pass na anonymous function to a method

}
