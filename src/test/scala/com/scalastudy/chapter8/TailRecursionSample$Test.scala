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


  test("testBoomBang"){
    //bang(5)
    //boom(5)

  }

  test("testFactorialMatchTailRecursion"){
    //assert(factorialMatchTailRecursion(0) == 1)
    assert(factorialMatchTailRecursion(1) == 1)
    assert(factorialMatchTailRecursion(3) == 3 * 2 * 1)
    assert(factorialMatchTailRecursion(4) == 4 * 3 * 2 * 1)
  }

  test("testFibNoRecursion"){
    assert(fibNoRecursion(0) == 0)
    assert(fibNoRecursion(1) == 1)
    assert(fibNoRecursion(2) == 1)
    assert(fibNoRecursion(3) == 2)
    assert(fibNoRecursion(4) == 3)
    assert(fibNoRecursion(5) == 5)
    fibNoRecursion(100000)
  }

  test("testFibRecursion"){
    assert(fibRecursion(0) == 0)
    assert(fibRecursion(1) == 1)
    assert(fibRecursion(2) == 1)
    assert(fibRecursion(3) == 2)
    assert(fibRecursion(4) == 3)
    assert(fibRecursion(5) == 5)
    //fibRecursion(100000) //StackOverflow
  }


  test("testFibTailRecursion"){
    assert(fibTailRecursion(0) == 0)
    assert(fibTailRecursion(1) == 1)
    assert(fibTailRecursion(2) == 1)
    assert(fibTailRecursion(3) == 2)
    assert(fibTailRecursion(4) == 3)
    assert(fibTailRecursion(5) == 5)
    fibTailRecursion(100000)
  }

}
