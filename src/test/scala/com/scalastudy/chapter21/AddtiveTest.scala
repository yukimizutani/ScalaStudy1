package com.scalastudy.chapter21

import org.scalatest.FunSuite
import com.scalastudy.chapter21.Add._
/**
  * Created by f-takahashi on 2016/06/01.
  */

class AddtiveTest extends FunSuite {


  test("additive"){
    println(sum(List(1,2,3)))
    println(sum(List("A", "B", "C")))
  }

}
