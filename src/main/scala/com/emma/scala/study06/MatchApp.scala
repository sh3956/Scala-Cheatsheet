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

//  judgeGrade("A") // Excellent
//  judgeGrade("B") // good
//  judgeGrade("C") // ok

  def judgeGrade(name: String, grade: String): Unit ={
    grade match {
      case "A" => println("Excellent...")
      case "B" => println("Good...")
      case "C" => println("OK...")
      case _ if(name == "lisi") => println(name + ", you are good...")
      case _  => println("need word harder...")
    }
  }

//  judgeGrade("zhangsan", "D") // need word harder
//  judgeGrade("lisi", "D") // lisi, you are good...

  def greeting(array: Array[String]): Unit ={
    array match {
      case Array("zhangsan") => println("Hi: zhangsan")
      case Array(x, y) => println("Hi: " + x + " , " +y)
      case Array("zhangsan", _*) => println("Hi: zhangsan and other friends")
      case _ => println("Hi： everybody...")
    }
  }

  greeting(Array("zhangsan")) // Hi : zhangsan
  greeting(Array("zhangsan", "lisi", "wangwu")) // Hi: zhangsan and other friends
  greeting(Array("lisi", "zhangsan", "wangwu")) // Hi: everybody...






}
