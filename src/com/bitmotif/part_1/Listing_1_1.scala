package com.bitmotif.part_1

object Listing_1_1 {

  class Cafe {
    def buyCoffee(cc: CreditCard): Coffee = {
      val cup = new Coffee()
      cc.charge(cup.price)
      cup
    }
  }

  class CreditCard {
    def charge(price: Double) = ???
  }

  class Coffee {
    def price: Double = ???
  }
}
