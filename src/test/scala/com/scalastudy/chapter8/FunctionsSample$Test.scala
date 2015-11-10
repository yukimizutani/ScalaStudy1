package com.scalastudy.chapter8

import java.util

import org.scalatest.FunSuite


class FunctionsSample$Test extends FunSuite {


  test("processFile"){
    //FunctionsSample.processFile("D:\\scala\\20150819\\hello.scala",10)
  }


//  test("function literals"){
//    val increase = (x: Int) => x + 1
//    assert(increase(1) == 2)
//
//    val increase2 = (x:Int) => {
//      println("We")
//      println("are")
//      println("here!")
//      x + 1
//    }
//    assert(increase2(10) == 11)
//  }


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


  test("aaa"){
    val a = FunctionsSample.returnFunc()
    assert(a(1) === 2)

    val b = FunctionsSample.returnFunc2()
    assert(b() === 2)

    val c = FunctionsSample.closure()
    assert(c() === 1)

    val d = FunctionsSample.closure()
    assert(d() === 2)
    assert(d() === 3)
    assert(c() === 4)

    val e = FunctionsSample.closure2()
    assert(e() === 1)
    assert(e() === 2)

    val f = FunctionsSample.closure2()
    assert(f() === 1)
    assert(f() === 2)

    val g = FunctionsSample.closure3()
    assert(g(10) === 10)
    assert(g(1) === 11)
    assert(g(2) === 13)

    val h = FunctionsSample.closure4(3)
    assert(h(1) === 4)
    assert(h(1) === 4)
    assert(h(10) === 13)

    val i = FunctionsSample.closure4(100)
    assert(i(1) === 101)
  }


  test("Option"){
    val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
    assert(capitals.get("France") === Some("Paris"))
    assert(capitals.get("America") === None)


    val s:Option[String] = capitals.get("Japan")

    assert(FunctionsSample.show(capitals.get("France")) === "Paris")
    assert(FunctionsSample.show(capitals.get("America")) === "?")
  }



}
