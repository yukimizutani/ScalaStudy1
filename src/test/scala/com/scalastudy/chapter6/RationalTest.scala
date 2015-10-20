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
    val result = a + b
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

  test("+ で足し算を実行する"){
    val a = new Rational(1,2)
    val b = new Rational(2,3)
    val result = a + b
    assert(result.toString === "7/6")
  }

  test("- で引き算を実行する"){
    val a = new Rational(2,3)
    val b = new Rational(1,3)
    val result = a - b
    assert(result.toString === "1/3")
  }

  test("* で掛け算を実行する"){
    val a = new Rational(1,2)
    val b = new Rational(2,3)
    val result = a * b
    assert(result.toString === "1/3")
  }

  test(" / で割り算を実行する") {
    val a = new Rational(1,2)
    val b = new Rational(2,3)
    val result = a / b
    assert(result.toString === "3/4")
  }

  implicit def intToRational(x:Int):Rational = new Rational(x)

  test("暗黙の方変換を実行する"){
    val a = new Rational(1,2)
    val result = 1 + a
    assert(result.toString === "3/2" )
  }
}
