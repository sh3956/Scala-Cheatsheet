package com.emma.scala.study06

import scala.util.Random

object MatchApp extends App{

  val names = Array("a", "b", "c")
  val name = names(Random.nextInt(names.length))

  name match {
    case "a" => println("aaa")
    case "b" => println("bbb")
    case _ => println("nothing")
  }

  def judgeGrade(grade: String): Unit ={
    grade match {
      case "A" => println("Excellent...")
      case "B" => println("Good...")
      case "C" => println("OK...")
      case _ => println("Need improvement...")
    }
  }

  judgeGrade("A") // Excellent
  judgeGrade("B") // good
  judgeGrade("C") // ok






}
