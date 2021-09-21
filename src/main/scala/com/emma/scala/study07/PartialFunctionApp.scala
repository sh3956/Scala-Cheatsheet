package com.emma.scala.study07
import scala.util.Random

/**
 * partial function: a set of case with no match inside{}
 */
object PartialFunctionApp extends App{

  val names = Array("a", "b", "c")
  val name = names(Random.nextInt(names.length))

  name match {
    case "a" => println("aaa")
    case "b" => println("bbb")
    case _ => println("nothing")
  }

  // A: input type B: output type
  def say:PartialFunction[String, String]={
    case "a" => "aaa"
    case "b" => "bbb"
    case _ => "nothing"
  }

  println(say("a"))


}
