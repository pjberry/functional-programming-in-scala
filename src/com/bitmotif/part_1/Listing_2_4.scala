package com.bitmotif.part_1

object Listing_2_4 {

  def findFirst[A](ss: Array[A], p: A => Boolean): Int = {
    
    @annotation.tailrec
    def loop(n: Int): Int = 
      if(n >= ss.length) -1
      else if ( p( ss(n) ) ) n
      else loop(n + 1)

    loop(0)
  }

}
