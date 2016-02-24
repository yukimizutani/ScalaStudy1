package com.scalastudy.chapter15

import com.scalastudy.chapter15.BTree._
import org.scalatest.FunSuite



class BTree$Test extends FunSuite {

  test("testMax") {
    val a = Branch(1, Empty, Empty)
    assert(BTree.max(a) === 1)

    val b = Branch(1, Branch(2, Empty, Empty), Empty)
    val c = Branch(2, Branch(1, Empty, Empty), Empty)
    assert(BTree.max(b) === 2)
    assert(BTree.max(c) === 2)

    val d = Branch(1, Empty, Branch(2, Empty, Empty))
    val e = Branch(2, Empty, Branch(1, Empty, Empty))
    assert(BTree.max(d) === 2)
    assert(BTree.max(e) === 2)

    val f = Branch(1, Branch(2, Empty, Empty), Branch(3, Empty, Empty))
    val g = Branch(1, Branch(2, Empty, Empty), Branch(5, f, f))
    assert(BTree.max(f) === 3)
    assert(BTree.max(g) === 5)

    val h = Empty
    assert(BTree.max(h) === 0)


  }

  test("testMin") {

  }
}
