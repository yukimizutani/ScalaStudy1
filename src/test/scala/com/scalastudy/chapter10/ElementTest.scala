package com.scalastudy.chapter10

import org.scalatest.FunSuite


class ElementTest extends FunSuite {

  test("testContents") {
    val ae = new ArrayElement(Array("hello","world"))
    assert(ae.width == 5)

    val e:Element = new ArrayElement(Array("hello"))

  }

}
