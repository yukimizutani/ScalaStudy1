package com.scalastudy.chapter15


object Opt {

  def toInt(s:String):Option[Int] = {
    try{
      Some(Integer.valueOf(s))
    } catch {
      case _ => None
    }
  }

}
