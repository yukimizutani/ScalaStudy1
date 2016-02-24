package com.scalastudy.chapter15

import com.scalastudy.chapter15.ExprObj.{Number, UnOp}
import org.scalatest.FunSuite

/**
 * Created by f-takahashi on 2016/02/10.
 */
class ExprObj$Test extends FunSuite {

  test("testVariableBind") {

  }

  test("testSimplifyTop") {
    val a = UnOp("abs", UnOp("abs", Number(1)))
    assert(ExprObj.variableBind(a) === UnOp("abs", Number(1)) )
  }

}
