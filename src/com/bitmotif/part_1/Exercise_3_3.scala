package com.bitmotif.part_1

object Exercise_3_3 {

  import fpinscala.datastructures._
  
  def setHead[A](a: A, list: List[A]): List[A] = 
    a match {
      case Nil => list 
      case _ => Cons(a, list)
    }
}
