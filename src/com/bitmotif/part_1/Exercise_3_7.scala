package com.bitmotif.part_1

object Exercise_3_7 {

  import fpinscala.datastructures._

  /*
    The existing version of fold right does not allow short circuiting (so far).
    If we want to short circuit, one way is pass a predicate.
  */
  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B)(predicate: (A) => Boolean): B = {

    println(s"current list is: ${as}") 

    as match {
      case Nil => z
      case Cons(x, xs) => if(!predicate(x)) f(x, z) else f(x, foldRight(xs, z)(f)(predicate))
    }

  }

  def product(ns: List[Double]) = foldRight(ns, 1.0)(_ * _)(_ != 0)
  
}
