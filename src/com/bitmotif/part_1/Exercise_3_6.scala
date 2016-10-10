package com.bitmotif.part_1

object Exercise_3_6 {

  import fpinscala.datastructures._

  def init[A](list: List[A]): List[A] = {
   
    @annotation.tailrec 
    def loopInit(current: List[A], accumulation: List[A]): List[A] = {
      current match {
        case Nil => accumulation
        case Cons(head, Nil) => accumulation
        case Cons(head, tail) => loopInit(tail, Cons(head, accumulation))
      }
    }

    @annotation.tailrec
    def reverse(current: List[A], accumulation: List[A]): List[A] = {
      current match {
        case Nil => accumulation
        case Cons(head, tail) => reverse(tail, Cons(head, accumulation))
      }

    }
    reverse( loopInit(list, Nil), Nil )
  }
}
