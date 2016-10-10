package com.bitmotif.part_1

object Exercise_3_5 {

  import fpinscala.datastructures._
 
  @annotation.tailrec 
  def dropWhile[A](list: List[A], f: A => Boolean): List[A] =
    list match {
      case Nil => list
      case Cons(head, tail) =>
        if ( !f(head) ) list
        else dropWhile(tail, f)    
    } 

}
