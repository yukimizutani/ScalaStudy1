package com.scalastudy.chapter15

object ExprObj {

  abstract sealed class Expr
  case class Var(name: String) extends Expr
  case class Number(num:Double) extends Expr
  case class UnOp(operator:String, arg:Expr) extends Expr
  case class BinOp(oparator:String, left:Expr, right:Expr) extends Expr

  def simplifyTop(expr:Expr):Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr
  }


  def variableBind(expr:Expr):Expr = expr match {
    case UnOp("abs", e @ UnOp("abs", _)) => e
    case _ => expr
  }

  def simplyfyAdd(e:Expr) = e match {
    case BinOp("+", x, y) if x == y => BinOp("*", x, Number(2))
    case _ => e
  }

  def simplyfyBad(exp:Expr):Expr = exp match {
    case UnOp(op, e) => UnOp(op, simplyfyBad(e))
    case UnOp("-", UnOp("-", e)) => e
  }

  def describe(e:Expr):String = e match {
    case Number(_) => "a number"
    case Var(_) => "a variable"
  }

}
