package com.scalastudy.chapter15

import org.scalatest.FunSuite


class DayOfWeekTest extends FunSuite {

  test("DayOfWeek"){
    val a = Sunday
    assert(Obj.returnInt(a) === 1)

    val b  = Friday
    assert(Obj.returnInt(b) === 6)
  }

}
