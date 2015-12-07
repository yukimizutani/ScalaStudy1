package com.scalastudy.chapter8

import org.scalatest.FunSuite
import com.scalastudy.chapter8.TailRecursionSample._


class TailRecursionSample$Test extends FunSuite {

  test("testFactorial") {
    assert(factorial(0) == 1)
    assert(factorial(1) == 1)
    assert(factorial(3) == 3 * 2 * 1)
    assert(factorial(4) == 4 * 3 * 2 * 1)
  }

  test("testFactorialMatch"){
    assert(factorialMatch(0) == 1)
    assert(factorialMatch(1) == 1)
    assert(factorialMatch(3) == 3 * 2 * 1)
    assert(factorialMatch(4) == 4 * 3 * 2 * 1)
  }


  test("testIsGoodEnouth"){
    assert(isGoodEnough(1.41421356237) == true)
    assert(isGoodEnough(1.4142135) == true)
    assert(isGoodEnough(1.414) == false)
  }

  test("testImprove"){
    assert(improve(8.0) == 2.0)


  }

}
