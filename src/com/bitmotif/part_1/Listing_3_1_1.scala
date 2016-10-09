package fpinscala.datastructures

trait L[+A]

case object N extends L[Nothing]

case class C[+A](head: A, tail: L[A]) extends L[A] {

  override def toString: String = {
          
    @annotation.tailrec
    def loop(cons: L[A], string: String, ending: String): String = {
      cons match {
        case N => 
          string + ending
          
        case C(head, N) =>
         val prepend = if(string.isEmpty) string else s"$string, " 
         loop(N, s"${prepend}C($head, N)", ending)
          
        case C(head, tail) => 
         val prepend = if(string.isEmpty) string else s"$string, "
         loop(tail, s"${prepend}C($head", s"${ending})")
      }  
    }
    
    loop(this, "", "")
  }
}


object L {
  
  def apply[A](as: A*): L[A] = 
    if(as.isEmpty) N
    else C(as.head, apply(as.tail: _*))


  def make(int: Int): L[Int] = {
    @annotation.tailrec
    def loop(i: Int, list: L[Int]): L[Int] = {
      if(i == 0) list
      else loop(i -1, C(i, list))
    }
  
    loop(int, N)
  } 
} 




