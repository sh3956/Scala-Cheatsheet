package com.emma.scala.study05

object MapApp extends App{
  val a = Map("PK" -> 18, "zhangsan" -> 30) //immutable map
  println(a("zhangsan"))
  // a("PK") = 18 error message since immutable

  val b = scala.collection.mutable.Map("PK" -> 18, "zhangsan" -> 30)
  // mutable collectoin

  val c = scala.collection.mutable.HashMap[String, Int]()

  b.get("PK") // Option[Int] = Some(16)
  b.get("PK").get // Int = 16
  b.getOrElse("lisi", 9)  // Int = 9
  b("lisi") = 40

  b += ("wangwu" -> 4, "zhaoliu" -> 5)
  b -= "wangwu"


  // iteration
  for ((key, value) <- b){
    println(key +" : " + value)
  }

  for (key <- b.keySet){
    println(key +" : " + b.getOrElse(key, 9))
  }

  for (value <- b.values){
    println(value)




}
