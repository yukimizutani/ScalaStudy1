package com.scalastudy.chapter8

import org.scalatest.FunSuite


class FunctionsSample$Test extends FunSuite {


  test("processFile"){
    //FunctionsSample.processFile("D:\\scala\\20150819\\hello.scala",10)
  }


  test("function literals"){
    val increase = (x: Int) => x + 1
    assert(increase(1) == 2)

    val increase2 = (x:Int) => {
      println("We")
      println("are")
      println("here!")
      x + 1
    }
    assert(increase2(10) == 11)
  }


  test("list method"){
    val someNumbers = List(-11,-10,-5,0,5,10)
    someNumbers.foreach(println(_))
    val filteredNumbers = someNumbers.filter( _ > 0)
    assert(filteredNumbers.size == 2)
    assert(filteredNumbers.isInstanceOf[List[Int]])

  }


  test("place holder"){
    val f = (_:Int) + (_:Int)
    assert(f(1,2) == 3)

    val f2 = (x:Int,y:Int) => x + y
    assert(f2(1, 2).===(3))
  }

}
