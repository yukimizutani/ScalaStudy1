package com.scalastudy.chapter12

import org.scalatest.FunSuite

class BirdTest extends FunSuite {

  test("testBird"){

    val pe = new Pegeon with Flying
    pe.fly()
    pe.swim()

    println("************************")

    val h = new Hawk
    h.fly()
    h.swim()

    println("************************")

    val f = new FrigateBird
    f.fly()

    println("************************")

    val peg = new Penguin
    peg.swim()
  }

}
