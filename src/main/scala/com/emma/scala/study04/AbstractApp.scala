package com.emma.scala.study04

object AbstractApp {
  def main(args: Array[String]): Unit = {

    val student = new Student2()
    println(student.name)
    student.speak

  }
}

abstract class Person2 {
  def speak
  val name:String
  val age:Int
}

class Student2 extends Person2 {
  override def speak: Unit = {
    println("speak")
  }
  override val name: String = "PK"
  override val age: Int = 18
}