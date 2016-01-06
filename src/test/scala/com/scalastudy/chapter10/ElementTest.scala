package com.scalastudy.chapter10

import org.scalatest.FunSuite
import com.scalastudy.chapter10.Element._


class ElementTest extends FunSuite {

  test("testArrayElement") {
    val ae = elem(Array("hello","world"))
    assert(ae.width == 5)

    val e:Element = elem(Array("hello"))
    assert(e.width == 5)
  }

  test("testLineElement") {
    val le = elem("abc")
    assert(le.toString == "abc")
  }

  test("zip"){
    val a = Array(1,2,3) zip Array("a","b","c")
    assert(a === Array((1,"a"), (2,"b"), (3,"c")))

    val b = Array(1,2,3) zip Array("a","b")
    assert(b === Array((1,"a"), (2,"b")))

    val c = Array.fill(2)("*")
    assert(c === Array("*","*"))
  }

  test("companion object Element"){
    val ae = elem(Array("a","b","c"))
    //assert(ae.isInstanceOf[ArrayElement])
    assert(ae.isInstanceOf[Element])

    val le = elem("line")
    //assert(le.isInstanceOf[LineElement])
    assert(le.isInstanceOf[Element])

    val ue = elem('*', 2, 3)
    //assert(ue.isInstanceOf[UniformElement])
    assert(ue.isInstanceOf[Element])
  }

//  test("widen"){
//    val le = elem("abc")
//    assert(le.widen(5).toString == "*abc*")
//    assert(le.widen(7).toString == "**abc**")
//  }
//
//
//  test("heighten"){
//    val le = elem(Array("abc","def","ghi"))
//    print(le.heighten(5).toString)
//  }

  test("Spiral"){
    println("Spriral 6")
    print(Spiral.spiral(6,0) + "\n")
    println("@@@@@@@@@@@@@@@@@@@@@@")
    println("Spriral 11")
    print(Spiral.spiral(11,0))
  }

}
