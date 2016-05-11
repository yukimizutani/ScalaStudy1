package com.scalastudy.chapter22

import org.scalatest.FunSuite


class FruitsTest extends FunSuite {

  test("fruits"){
    val apples:List[Apple] = new Apple :: Nil
    val fruis: List[Fruits] = new Orange :: apples

    val fruis2:List[Fruits] =  new Apple :: Nil ::: List(new Orange)



  }
}
