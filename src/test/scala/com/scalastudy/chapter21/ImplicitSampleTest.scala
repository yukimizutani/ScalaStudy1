package com.scalastudy.chapter21

import org.scalatest.FunSuite
import com.scalastudy.chapter21.ImplicitSample._


class ImplicitSampleTest extends FunSuite{

  test("implicit conversion"){

    val a:Int = 1
    val b:Boolean = 1
    val c:String = 1

    val d:Map[Int, String] = Map(1 -> "A")

    val e = -1
    e.abs

    if(1){
      println("passed!")
    }

    println("Hi".smile)
  }

  test("tap test"){
    "Hi".tap(println)
    val a = List(-1,0,1,2,3,4,5).tap(s => println("Before filter : " + s))
      .filter(_ > 1).tap(s => println("After filter1 :" + s))
      .filter( _ % 2 == 0).tap(s => println("After filter2 :" + s))
      .sum
  }

}
