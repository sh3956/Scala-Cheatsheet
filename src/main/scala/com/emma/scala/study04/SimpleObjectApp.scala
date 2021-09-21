package com.emma.scala.study04

object SimpleObjectApp {

  def main(args: Array[String]): Unit = {
    val person = new People()
    person.name = "Messi"
    //person.age = 30
    println(person.name + "..." + person.age)
    println("Invoke eat method: " + person.eat)
    person.watch("Barcelona")
    person.printInfo()
    // println(person.gender)
  }

}

class People {
  var name:String = _
  val age:Int = 10
  // 出了这个类就不能访问了
  private [this] val gender = "male"
  def printInfo():Unit = {
    println("gender: " + gender)
  }
  // define methods
  def eat():String = {
    name + " eat...."
  }
  def watch(teamname: String):Unit = {
    println(name + " is watching match of " + teamname)
  }

}