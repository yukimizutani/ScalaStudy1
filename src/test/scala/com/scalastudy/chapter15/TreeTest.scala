package com.scalastudy.chapter15

import org.scalatest.FunSuite

class TreeTest extends FunSuite {

  test("max"){
    val a = Tree.max(Branch(1,Branch(2,Empty,Empty),Branch(3, Empty, Empty)))
    assert(a === 3)
  }

  test("min"){
    val a = Tree.min(Branch(1,Branch(2,Empty, Empty), Branch(3, Empty, Empty)))
    assert(a === 1)
  }

  test("depth"){
    val a = Tree.depth(Empty)
    assert(a === 0)

    val b = Tree.depth(Branch(1,Empty,Empty))
    assert(b === 1)

  }
}
