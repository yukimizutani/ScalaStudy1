package com.scalastudy.chapter13

import com.scalastudy.chapter12.Bird
import org.scalatest.FunSuite
//import com.scalastudy.chapter13.Fruit

class FruitTest extends FunSuite {

  test("import"){
    val a = Fruits.menu
    assert(a.size === 3)

    val b = new Bird {}

  }
}
