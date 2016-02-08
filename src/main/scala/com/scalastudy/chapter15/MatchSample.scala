package com.scalastudy.chapter15


object MatchSample {

  def wild(x:Any) = x match {
    case s: String  => 2
    case  _  => 1
  }

  def const(x:Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "Hello" => "hi!"
    case Nil => "the empty list"
    case _  => "something else"
  }

  def variable(x:Any)= x match {
    case 0 => "zero"
    case somethingElse => "not zero:" + somethingElse
  }


  def seq(x:Any) = x match {
    case List(0) => 1
    case List(0, _:String) => 2
    case _ => 0
  }

  def tuple(x:Any) = x match {
    case (a:Int, b:String, c) => 1
    case _  => 0
  }

  def erasure(x:Any) = x match {
    case m:Map[Int,Int] => m.size
    case _ => false
  }

}
