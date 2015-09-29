package com.scalastudy.chapter6

import org.scalatest.FunSuite


class RationalTest extends FunSuite {

  test("インスタンス生成時にprintlnが実行される"){
    new Rational(1,2)
  }

  test("分母に0を指定した場合、チェック例外を投げる"){
    intercept[IllegalArgumentException] {
      new Rational(2,0)
    }
  }

  test("toString で 分子/分母 形式の文字列を返す"){
    val a = new Rational(1,2)
    assert(a.toString === "1/2" )
  }

  test("add で 分数の足し算の結果を返す"){
    val a = new Rational(1,2)
    val b = new Rational(1,3)
    val result = a.add(b)
    assert(result.toString === "5/6")
  }

  test("lessThan で 自分の方が小さい場合は true を返す"){
    val a = new Rational(1,5)
    val b = new Rational(1,2)
    assert(a.lessThan(b))
  }

  test("補助コンストラクタで、分母未指定の場合は自動的に分母に1をセットする"){
    val a = new Rational(3)
    assert(a.denom === 1)
  }

}
