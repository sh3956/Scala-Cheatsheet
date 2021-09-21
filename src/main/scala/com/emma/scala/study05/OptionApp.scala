package com.emma.scala.study05

object OptionApp extends App{
  val m = Map(1 -> 2)
  println(m.get(1)) // Some(2)
  println(m.getOrElse(2, "None"))
}

/**
 *  case object None extends Option[Nothing] {
 *  def isEmpty = True
 *  def get = throw new NoSuchElementException("None.get")
 *  }
 *
 *  final case class Some[+A](x: A) extends Option[A] {
 *    def isEmpty = false
 *    def get = x
 *  }
 */
