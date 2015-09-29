package com.scalastudy.chapter6

/**
 * 分数の加減乗除を定義するクラス
 *　
 *  @param n 分子
 *  @param d 分母
 *　
 */
class Rational(n: Int, d: Int) {

  require(d != 0)
  println("Created " + n + "/" + d)

  val numer: Int = n
  val denom: Int = d

  def this(n: Int) = this(n,1)

  override def toString =  n + "/" + d

  def add(that:Rational):Rational = new Rational(numer * that.denom + that.numer * denom , denom * that.denom)

  def lessThan(that: Rational):Boolean = this.numer * that.denom < that.numer * this.denom
}
