package com.scalastudy.chapter19

import java.io.File

import org.scalatest.FunSuite

class CellTest extends FunSuite {

  test("test cell"){
    var a:Cell[Any] = new Cell[Any](1)
    val b:Cell[Int] = new Cell[Int](1)

    //invariant (compile error)
    //a = b


    var c:CellCovariant[Any] = new CellCovariant[Any](1)
    var d:CellCovariant[Int] = new CellCovariant[Int](2)

    //covariant (OK)
    c = d
  }

  test("test java"){
    //invariant (compile error)
    //val arr:Array[Any] = new Array[String](1)

  }

  test("test pair"){
    val a:Pair[Any, Any] = new Pair[Int,Int](1,2)


  }

}
