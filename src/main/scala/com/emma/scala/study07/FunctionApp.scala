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

  //currying function
  // split a function with two parameters into two
  def sum(a:Int, b:Int) = a+b
  println(sum(2,3))

  def sum2(a:Int)(b:Int) = a + b
  println(sum2(2)(3))

  // higher order function
  val l = List(1,2,3,4,5,6,7,8)
  //map: operate on each element in the list
//  println(l.map((x:Int)=>x+1))
//  println(l.map((x)=>x*2))
 // println(l.map(_*2)) // _ use placeholder
  //l.map(_*2).foreach(println)

  l.map(_*2).filter(_>8).foreach(println)
  l.take(2) // take first 2 elements

  println(l.reduce(_+_)) // add all
  println(l.reduceLeft(_-_)) //-34
  println(l.reduceRight(_-_)) //-4  1-（2-（3-(4-(5-(6-(7-8))))）））

  l.fold(0)(_-_)
  l.foldLeft(0)(_-_)
  l.foldRight(0)(_-_)

  val f = List(List(1,2), List(3,4), List(5,6))
  println(f.flatten) // List[Int] = List(1,2,3,4,5,6)

  //flatMap
  f.map(_.map(_*2))
  f.flatMap(_.map(_*2)) // List(2,4,6,8,10,12)


  val txt = scala.io.Source.fromFile("src/main/scala/com/emma/scala/study07/hello.txt").mkString
  println(txt) // hello,world, hello, world

  val txts = List(txt)
  // method chaining
  txts.flatMap(_.split(",")).map(x=>(x, 1)).foreach(println)
  // calculate word counts
  println(txts.flatMap(x=>x.split(",")).map(x=>(x, 1)).groupBy(x=>x._1).map(x=>(x._1, x._2.size)))

}
