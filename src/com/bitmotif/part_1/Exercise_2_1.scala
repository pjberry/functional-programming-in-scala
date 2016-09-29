package com.bitmotif.part_1
	
object Exercise_2_1 {

	def fib(n: Int): Int = {
	  
	  @annotation.tailrec
	  def loop(end: Int, loopCount: Int, fibN_Minus1: Int, fibN_Minus2: Int): Int = 
	    if (end == loopCount) fibN_Minus1 + fibN_Minus2 else loop(end, loopCount + 1, fibN_Minus1 + fibN_Minus2, fibN_Minus1)
	     

	  if(n < 1) {
	    throw new IllegalArgumentException("The argument must be 1 or greater.")
	  }
	  else if (n == 1)  {
	   0
	  }
	  else if (n == 2) {
	   1
	  }
	  else {
	   loop(n, 3, 1, 0)
	  } 
	} 
}
	
