package com.bitmotif.part_1

object Listing_3_2 {

  import fpinscala.datastructures._

  def foldRight[A, B](as: List[A], z: B)(f: (A, B) => B): B =
    as match {
      case Nil => z
      case Cons(x, xs) => f(x, foldRight(xs, z)(f))
    }

  def sum2(ns: List[Int]) = foldRight(ns, 0)((x, y) => x + y)

  def product2(ns: List[Double]) = foldRight(ns, 1.0)(_ * _)
 
 /*
    foldRight(Cons(1, Cons(2, Cons(3, Nil))), 0)((x, y) => x + y)
    foldRight(Cons(2, Cons(3, Nil))), 1 + 0)((x, y) => x + y)
    foldRight(Cons(3, Nil)), 1 + 2)((x, y) => x + y)
    foldRight(Nil, 3 + 3)((x, y) => x + y)
    6
  */
  def foldRightAlternate[A, B](as: List[A], z: B)(f: (A, B) => B): B = {
    println(s"$as $z ")
    as match {
      case Nil => z
      case Cons(x, xs) => foldRightAlternate(xs, f(x, z))(f)
    }
  }

}


