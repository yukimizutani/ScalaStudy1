package com.scalastudy.chapter19

import org.scalatest.FunSuite


class CellTest extends FunSuite {

  test("Cell"){
    var a:Cell[Any] = new Cell("ABC")
    var b = new Cell(1)

    //a.put(1)
    //b.put("ABC")
  }

}
