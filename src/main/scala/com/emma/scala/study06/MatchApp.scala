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

  def greeting(list:List[String]): Unit ={
        list match {
          case "zhangsan"::Nil => println("Hi: zhangsan")
          case x::y::Nil => println("Hi: " +x + " , " +y)
          case "zhangsan" ::tail => println("Hi: zhagnsan and other friends")
          case _ => println("Hi everybody...")
        }
  }
  greeting(List("zhangsan")) // Hi : zhangsan
  greeting(List("zhangsan", "lisi", "wangwu")) // Hi: zhangsan and other friends
  greeting(List("lisi", "zhangsan", "wangwu")) // Hi: everybody...

  def matchType(obj:Any): Unit ={
    obj match{
      case x:Int => println("Int")
      case s:String => println("String")
      case m:Map[_,_] => m.foreach(println)
      case _ =>println("other type")
    }
  }

//  matchType(1) // Int
//  matchType(1l) // other type
//  matchType(Map("name"->"PK")) // (name, PK)


  def caseclassMatch(person:Person): Unit ={
    person match {
      case CTO(name, floor) => println("CTO, name: "+name+" floor: "+floor)
      case Employee(name, floor) => println("Employee, name: "+name+" floor: "+floor)
      case _ => println("Other")
    }
  }
  class Person // set a high level class to use match
  case class CTO(name:String, floor:String) extends Person
  case class Employee(name:String, floor:String) extends Person
  case class Other(name:String) extends Person

  caseclassMatch(CTO("PK", "22"))
  caseclassMatch(Employee("zhangsan", "2"))
  caseclassMatch(Other("other"))




}
