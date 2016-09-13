package com.bitmotif.part_1

object Listing_1_2_1 {

  class Cafe {
    def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
      val cup = new Coffee()
      (cup, Charge(cc, cup.price))
    }
  }

  class CreditCard {
    def charge(price: Double) = ???
  }

  class Coffee {
    def price: Double = ???
  }

  case class Charge(cc: CreditCard, amount: Double) {
    def combine(other: Charge): Charge = 
      if(other.cc == cc) Charge(cc, amount + other.amount) else throw new Exception("Can't combine charges to different cards")
  }

}
