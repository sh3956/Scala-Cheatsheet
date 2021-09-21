package com.emma.scala.study07

object StringApp extends App {

  val s = "Hello:PK"
  val name = "PK"

  println(s"Hello:$name") // Hello:PK

  val team = "AC"
  // interpolation
  println(s"Hello:$name, Welcome to $team")

  val b =
    """
      |this ia a multiline string
      |hello
      |world
      |""".stripMargin

  println(b)


}
