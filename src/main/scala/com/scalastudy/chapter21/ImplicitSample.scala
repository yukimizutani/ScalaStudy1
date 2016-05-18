package com.scalastudy.chapter21


object ImplicitSample {
  implicit def intToBoolean(arg:Int):Boolean = arg != 0
  implicit def intToString(arg:Int):String = String.valueOf(arg)
  //implicit def enrichString(arg:String):RichString = new RichString(arg)
  implicit class RichString(val src:String){
    def smile:String = src + ":-)"
  }

  implicit class Tap[T](self:T){
    def tap[U](block:T => U):T = {
      block(self)
      self
    }
  }
}




