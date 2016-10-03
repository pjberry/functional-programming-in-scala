package com.bitmotif.part_1
	
object Exercise_2_2 {

  def isSorted[A](array: Array[A], ordered: (A, A) => Boolean): Boolean = {

    @annotation.tailrec
    def loop(index: Int, currentValue: Boolean): Boolean = {
      if (currentValue == false) false
      else if (array.size == 0) true
      else if (index == array.size - 1) currentValue
      else loop(index + 1, ordered(array(index), array(index + 1)))
    }

    loop(0, true)
  }
}
	
