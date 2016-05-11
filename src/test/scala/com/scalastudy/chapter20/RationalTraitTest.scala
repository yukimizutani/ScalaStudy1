package com.scalastudy.chapter20

import org.scalatest.FunSuite

class RationalTraitTest extends FunSuite {
  test("RationalTrait"){
    val x = 2
    val a = new RationalTrait {
      val numerArg = 1 * x
      val denomArg = 2 * x
    }
    assert( 1 === 1)
  }
}
