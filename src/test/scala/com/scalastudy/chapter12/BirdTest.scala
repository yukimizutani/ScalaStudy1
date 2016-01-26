package com.scalastudy.chapter12

import org.scalatest.FunSuite

class BirdTest extends FunSuite {

  test("testBird") {
    val pi = new Pigeon
    println(pi.name)
    pi.fly()
    pi.swim()

    println("*********")

    val h = new Hawk with Flying
    println(h.name)
    h.fly()
    h.swim()

    println("*********")

    val pe = new Penguin
    println(pe.name)
    pe.swim()

  }

}
