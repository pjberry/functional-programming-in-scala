package com.bitmotif.part_1

object Exercise_3_2 {

  import fpinscala.datastructures._
  
  def tail[A](list: List[A]): List[A] =
    list match {
      case Nil => Nil
      case Cons(head, tail) => tail
  }
}
