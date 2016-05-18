package com.scalastudy.chapter21


trait Additive[A] {
  def plus(a:A, b:A): A
  def zero: A
}

object AdditiveUtil{
  implicit object StringAdditive extends Additive[String]{
    override def plus(a: String, b: String): String = a + b
    override def zero: String = ""
  }


  implicit object IntAdditive extends Additive[Int]{
    override def plus(a: Int, b: Int): Int = a + b
    override def zero: Int = 0
  }

  def sum[A](lst: List[A])(implicit m: Additive[A]) = lst.foldLeft(m.zero)((x,y) => m.plus(x, y))
}