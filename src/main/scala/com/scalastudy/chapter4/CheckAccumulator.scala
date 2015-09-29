package com.scalastudy.chapter4

class CheckAccumulator {
  private var sum  = 0
  def add(b: Byte) { sum += b }
  def checksum(): Int = ~(sum & 0xFF) + 1
}

object CheckAccumulator {
  private var cache = Map[String,Int]()

  def calculate(s:String):Int = {
    if (cache.contains(s)){
      cache(s)
    }else{
      val acc = new CheckAccumulator
      for (c <- s){
        acc.add(c.toByte)
      }
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}