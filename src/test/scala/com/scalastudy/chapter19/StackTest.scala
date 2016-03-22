package com.scalastudy.chapter19

import org.scalatest.FunSuite

class StackTest extends FunSuite {

  test("NonEmptyStack"){
    val a = new NonEmptyStack[String]("First", Stack.apply())
    a.push("Second")

    assert(a.pop === ("Second", Stack.apply()))
    assert(a.pop === ("First", Stack.apply()))

  }

}
