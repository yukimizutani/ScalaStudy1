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

  test("sum"){
    assert(FunctionsSample.sum(1,2,3) == 6)

    val a = FunctionsSample.sum _
    assert(a(1,1,2) === 4)

    val b = FunctionsSample.sum(1,_:Int,3)
    assert(b(2) === 6 )
  }


  test("echo"){
    FunctionsSample.echo("a","b","c")
    FunctionsSample.echo("z")
    val a = Array("a","b","c")
    FunctionsSample.echo(a: _*)
  }

  test("speed"){
    assert(FunctionsSample.speed(1F,2F) == 0.5F)
    assert(FunctionsSample.speed(time = 2F, distance = 1F) == 0.5F)
    assert(FunctionsSample.speed(time = 2F) === 0.25)
  }

  test("list method2"){
    val list = List(1,2,3)
    assert(list.map(_ + 1) === List(2,3,4))
    assert(list.map((x:Int) => x + 1) === List(2,3,4))

    val words = List("the","quick")
    assert(words.map(_.length) === List(3,5))
    assert(words.map(_.length).filter(_ > 4) == List(5))



    assert(words.map(_.toList) === List(List('t','h','e'),List('q','u','i','c','k')))

    assert(words.flatMap(_.toList) === List('t','h','e','q','u','i','c','k'))


    val list2 = List(1,2,3,4,5)
    assert(list2.filter( _ % 2 == 0) === List(2,4))
    assert(list2.partition( _ % 2 == 0) === (List(2,4), List(1,3,5)) )

    assert(list2.find( _ % 2 == 0) === Some(2))
    //assert(list2.find( _ <  0) === None)
    assert(list2.exists( _ <  0))




  }

}
