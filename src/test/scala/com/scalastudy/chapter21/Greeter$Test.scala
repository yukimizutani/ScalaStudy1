package com.scalastudy.chapter21

import org.scalatest.FunSuite
import com.scalastudy.chapter21.Greeter._

class Greeter$Test extends FunSuite {
  test("greeter"){
    greet("Bob")
    maxListImpParam(List(1, 5, 10, 3))
  }
}
