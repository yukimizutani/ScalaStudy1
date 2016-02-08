package com.scalastudy.chapter15

import org.scalatest.FunSuite


class Exp$Test extends FunSuite {

  test("Exp"){
    val example = Add(Lit(1),Div(Mul(Lit(2),Lit(3)),Lit(2)))
    assert(Ob2.eval(example) === 4)

  }

}
