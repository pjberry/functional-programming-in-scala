package com.bitmotif.part_1
	
object Listing_2_2 {

	object MyModule {
	
	  def factorial(n: Int): Int = {
	    def go(n: Int, accumulation: Int): Int =
	      if (n <= 0) accumulation else go(n - 1, n * accumulation) 
	
	    go(n, 1)
	  }
	
	  def abs(n: Int): Int = 
	    if (n < 0) -n 
	    else n
	
	  private def formatAbs(x: Int) = {
	    val msg = "The absolute value of %d is %d"
	    msg.format(x, abs(x))
	  }
	
	  def main(args: Array[String]): Unit = 
	    println(formatAbs(-42))
	
	}
}
