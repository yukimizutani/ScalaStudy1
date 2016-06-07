package com.scalastudy.chapter21

class RichString(val src:String){
  def smile:String = src + ":-)"
}

object StringObj {
  implicit def enrichString(arg:String):RichString = new RichString(arg)
}
