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

  private val g = gcb(n.abs, d.abs) //nとdの最大公約数

  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n,1)

  override def toString =  numer + "/" + denom

  /**
   * 加算
   * @param that 加算対象の分数クラス
   * @return Rational 加算後の分数クラス
   */
  def + (that:Rational):Rational =
    new Rational(numer * that.denom + that.numer * denom , denom * that.denom)

  /**
   * 加算
   * @param i 加算対象の整数クラス
   * @return Rational 加算後の分数クラス
   */
  def + (i:Int): Rational = {
    //this.+(new Rational(i)
    new Rational(numer + i * denom, denom )
  }

  /**
   * 減算
   * @param that　減算対象の分数クラス
   * @return　Rational 減算後の分数クラス
   */
  def - (that:Rational):Rational =
    new Rational(numer * that.denom - that.numer * that.denom, denom * that.denom)


  /**
   * 乗算
   * @param that　乗算対象の分数クラス
   * @return　Rational 乗算後の分数クラス
   */
  def * (that:Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)


  /**
   * 除算
   * @param that　除算対象の分数クラス
   * @return　Rational 除算後の分数クラス
   */
  def / (that:Rational):Rational =
    new Rational(numer * that.denom, denom * that.numer)


  /**
   * 自身のほうが小さいかの判定
   * @param that 比較対象の分数クラス
   * @return Boolean 自身が小さい場合はtrue
   */
  def lessThan(that: Rational):Boolean =
    this.numer * that.denom < that.numer * this.denom

  /**
   * 最大公約数の計算
   * @param a 数値
   * @param b 数値
   * @return Int a と b の最大公約数
   */
  private def gcb(a: Int, b: Int): Int = if (b == 0) a else gcb(b, a % b)

}
