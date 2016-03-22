package com.scalastudy.chapter19

import org.scalatest.FunSuite

class StackTest extends FunSuite {

  test("NonEmptyStack"){
    val a = new NonEmptyStack[String]("First", Stack.apply())
    val b = a.push("Second")
    val c = b.push("Third")
    (c.pop._2 === ("Second", a) )

  }

}
