package com.emma.scala.study04

object CaseClass {
  def main(args: Array[String]):Unit = {
    println(Dog("wangcai").name)
  }
}

case class Dog(name:String)