package com.emma.scala.study03

object FunctionApp {

  def main(args: Array[String]):Unit = {
//    println(add(2, 3))
//    println(three) // function with no parameters
//    sayHello
//
//    sayName() // can not ignore ()
//    sayName("ruoze")
//
//    loadConf()
//    loadConf("spark-production.conf")
//    println(speed(100, 10))
//    println(speed(time=10, distance=100))
//    println(sum2(1,2,3,4,5)) // 可变参参数: varargs
//
//    val x = 1
//    if(x > 0) {
//      true
//    } else {
//      false
//    }
//    1 to 10 // inclusive
//    1.to(10)
//    Range(1, 10) // left inclusive right exclusive
//    1 until 10 // left inclusvie right exclusive
//    1.until(10)
    for (i <- 1 to 10 if i%2==0) {
      println(i)
    }
    val courses = Array("scala", "spark", "streaming")
    for (course <- courses){
      println(course)
    }
    // 集合元素做遍历
    courses.foreach(course => println(course))

    var (num, sum) = (100, 0)
    while (num > 0){
      sum = sum + num
      num = num - 1
    }
    println(sum)
  }

  def add(x:Int, y:Int):Int = {
    x + y
  }

  def three() = 1 + 2

  def sayHello(): Unit ={
    println("say hello...")
  }
  def sayName(name:String = "PK"):Unit = {
    println(name)
  }

  def loadConf(conf:String = "spark-defaults.conf"):Unit = {
    println(conf)
  }

  def speed(distance: Float, time:Float):Float = {
    distance/time
  }

  def sum(a:Int, b:Int, c:Int) = {
    a + b + c
  }
  def sum2(numbers:Int*) = {
    var result = 0
    for(number <- numbers){
      result += number
    }
    result
  }
}
