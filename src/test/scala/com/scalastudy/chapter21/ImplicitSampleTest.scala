package com.scalastudy.chapter21

import org.scalatest.FunSuite
import com.scalastudy.chapter21.StringObj.enrichString

class ImplicitSampleTest extends FunSuite{

  implicit def intToBoolean(arg:Int) :Boolean = arg != 0

  test("implicit conversion") {
    if(1) {
      println("AAA")
    }
  }

  test("enrichString"){
    println("Hi".smile)
  }

  test("scala standard"){
    val a:Int = -10
    a.abs

    val b = Map(1 -> "A", 2 -> "B")

  }

}
