package com.scalastudy.chapter15


sealed abstract class Exp

case class Add(lhs:Exp, rhp:Exp) extends Exp
case class Min(lhs:Exp, rhp:Exp) extends Exp
case class Mul(lhs:Exp, rhp:Exp) extends Exp
case class Div(lhs:Exp, rhp:Exp) extends Exp
case class Lit(value:Int) extends Exp

object Ob2{
  def eval(exp:Exp):Int = exp match {
    case Add(l, r)  => eval(l) + eval(r)
    case Min(l, r)  => eval(l) + eval(r)
    case Mul(l, r)  => eval(l) * eval(r)
    case Div(l, r)  => eval(l) / eval(r)
    case Lit(v) =>  v
}
}