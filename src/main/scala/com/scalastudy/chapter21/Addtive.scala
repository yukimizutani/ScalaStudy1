package com.scalastudy.chapter21


trait Addtive[A] {
  def plus(a:A, b:A):A
  def zero:A
}

object Add{

  implicit object StringAddtive extends Addtive[String]{
    override def plus(a: String, b: String): String = a + b
    override def zero: String = ""
  }

  implicit object IntAddtive extends Addtive[Int]{
    override def plus(a: Int, b: Int): Int = a + b
    override def zero: Int = 0
  }

  def sum[A](lst: List[A])(implicit m: Addtive[A]) = lst.foldLeft(m.zero)((x, y) => m.plus(x,y))
}