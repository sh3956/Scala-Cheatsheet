package com.emma.scala.study04

object ConstructorApp {
  def main(args: Array[String]): Unit = {
//    val person = new Person("zhangsan", 30)
//    println(person.name + " : " + person.age + " : " + person.school)
//
//    val person2 = new Person("pk", 18, "M")
//    println(person2.name + " : " + person2.age + " : " + person2.school
//    + " : " + person2.gender)
    val student = new Student("PK", 18, "Math")
    println(student.name + " ： " + student.major)
    println(student)
  }

}

// 主 constructor
class Person(val name:String, val age: Int){
  println("Person Constructor enter....")
  val school = "ustc"
  var gender:String = _
  def this(name:String, age:Int, gender:String){
    this(name, age) //第一行必须是主构造器 或者其他付构造器
    this.gender = gender
  }
  println("Person Constructor leave....")
}

class Student(name:String, age:Int, var major:String) extends Person(name,age){
  println("Person Student enter....")
  override val school = "peking"
  override def toString: String = "override toString: " + school

  println("Person Student leave....")
}