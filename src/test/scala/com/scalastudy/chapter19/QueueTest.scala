package com.scalastudy.chapter19

import org.scalatest.FunSuite

class QueueTest extends FunSuite {

  test("test queue "){
    var a = new Queue[Int](List(),List())
    val t0 = System.nanoTime()
    for(i <- 0 to 1000)
      a = a.enqueue(i)
    val t1 = System.nanoTime()
    println("slow append queue: enqueue time: " + (t1 - t0)/Math.pow(10,6) + "ms")

    val t2 = System.nanoTime()
    a.head
    val t3 = System.nanoTime()
    println("slow append queue: head time: " + (t3 - t2)/Math.pow(10,6) + "ms")
    println("*****************")
  }

  test("slow head queue"){
    var a = new Queue[Int](List(), List())
    val t0 = System.nanoTime()
    for(i <- 0 to 1000)
      a = a.enqueue(i)
    val t1 = System.nanoTime()
    println("slow head queue enqueue time: " + (t1 - t0)/Math.pow(10,6) + "ms")

    val t2 = System.nanoTime()
    a.head
    val t3 = System.nanoTime()
    println("slow head queue head time: " + (t3 - t2)/Math.pow(10,6) + "ms")
  }

}
