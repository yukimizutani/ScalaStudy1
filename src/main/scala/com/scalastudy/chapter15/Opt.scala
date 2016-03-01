package com.scalastudy.chapter15

import scala.io.Source

object Opt {

  def toInt(s:String):Option[Int] = {
    try{
      Some(Integer.parseInt(s))
    } catch {
      case e => None
    }
  }

  def readText(file:String):Option[List[String]] = {
    try{
      Some(Source.fromFile(file).getLines.toList)
    } catch {
      case e => None
    }
  }
}
