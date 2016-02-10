package com.scalastudy.chapter15

import com.scalastudy.chapter15.BTree.{Empty, Branch}
import org.scalatest.FunSuite


class BTree$Test extends FunSuite {

  test("testMax") {
    val a = Branch(1, Branch(2, Empty, Empty), Branch(3, Empty, Empty))
    assert(BTree.max(a) === 3)

    val b = Branch(1, Branch(2, Branch(4, Empty, Empty), Empty), Branch(10, Empty, Branch(3, Empty, Empty)))
    assert(BTree.max(b) === 10)

    val c = Empty
    intercept[RuntimeException](
      BTree.max(c)
    )
  }

  test("testMin") {
    val a = Branch(1, Branch(2, Empty, Empty), Branch(3, Empty, Empty))
    assert(BTree.min(a) === 1)

    val b = Branch(1, Branch(2, Branch(4, Empty, Empty), Empty), Branch(-10, Empty, Branch(3, Empty, Empty)))
    assert(BTree.min(b) === -10)

    val c = Empty
    intercept[RuntimeException](
      BTree.min(c)
    )
  }

  test("testDepth") {
    val a = Branch(1, Branch(2, Empty, Empty), Branch(3, Empty, Empty))
    //assert(BTree.depth(a) === 2)
  }

}
