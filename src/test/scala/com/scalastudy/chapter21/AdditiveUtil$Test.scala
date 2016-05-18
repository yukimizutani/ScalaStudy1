package com.scalastudy.chapter21

import org.scalatest.FunSuite
import com.scalastudy.chapter21.AdditiveUtil._

class AdditiveUtil$Test extends FunSuite {

  test("testSum") {
    println(sum(List(1, 2, 3)))
    println(sum(List("A", "B", "C")))

  }

}
