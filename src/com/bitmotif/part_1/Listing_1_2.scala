package com.bitmotif.part_1

object Listing_1_2 {

  class Cafe {
    def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
      val cup = new Coffee()
      p.charge(cc, cup.price)
      cup
    }
  }

  class CreditCard {
    def charge(price: Double) = ???
  }

  class Coffee {
    def price: Double = ???
  }

  class Payments {
    def charge(cc: CreditCard, price: Double) = ???
  }
}
