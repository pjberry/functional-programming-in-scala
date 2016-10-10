package com.bitmotif.part_1

object Exercise_3_4 {

  import fpinscala.datastructures._
 
  @annotation.tailrec 
  def drop[A](list: List[A], n: Int): List[A] = 
    list match {
      case Nil => list
      case Cons(_, tail) =>
        if (n <= 0) list
        else drop(tail, n - 1)    
    }

}
