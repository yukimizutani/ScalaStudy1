package com.scalastudy.chapter21


object Taps {
  implicit class Tap[T](self:T){
    def tap[U](block: T => U):T ={
      block(self)
      self
    }
  }
}
