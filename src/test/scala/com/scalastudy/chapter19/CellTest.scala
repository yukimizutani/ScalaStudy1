package com.scalastudy.chapter19

import org.scalatest.FunSuite

class CellTest extends FunSuite {

  test("Cell"){
    val a = new Cell[String]("A")
    a.put("B")
    assert(a.get() === "B")

    val b = new Cell[Int](1)
    b.put(2)
    assert(b.get() === 2)
  }

  test("Pair"){
    val a:Pair[Int,Int] = new Pair[Int,Int](1, 100)
    println(a.toString)

    val b = new Pair[String, String]("A", "B")
    println(b.toString)

    val c = new Pair(2, 200)
    println(c.toString)


    var d:Pair[Any, Any] = new Pair(1,2)
    d = a

  }

}
