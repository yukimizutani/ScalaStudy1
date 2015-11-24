package com.scalastudy.chapter8


object ClosureSample {

  def returnFunc(): Int => Int  = {
    (x:Int) =>  x + 1
  }

  def returnFunc2(): () => Int ={
    () => 1 + 2
  }

  var more = 0
  def f(x:Int) :Int = {
    more = x + more
    more
  }

  def f2() : () => Int = {
    var a = 0
    () => {
      a = a + 1
      a
    }
  }

  def f3(more:Int): Int => Int = {
    (x:Int) => {
      x + more
    }
  }

}
