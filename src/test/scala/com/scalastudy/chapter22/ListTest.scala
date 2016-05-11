package com.scalastudy.chapter22

import org.scalatest.FunSuite

class ListTest extends FunSuite{
  test("list test"){
    val a : List[Any] = List()

    a match {
      case h :: tail => 1
      case _ => Nil
    }

  }
}

