package com.scalastudy.chapter8


object TailRecursionSample {


  def factorial(n:Int):Int = {
    if( n <= 1 )
      1
    else
      n * factorial( n-1 )
  }


  def factorialMatch(n:Int) :Int =  n match {
    case 0 => 1
    case 1 => 1
    case _ => n * factorialMatch(n - 1)
  }


  def isGoodEnough(guess:Double):Boolean = {
    println("guess [" + guess + "]" )
    Math.abs(guess * guess - 2.0) < 1.0E-6
  }

  def improve(guess:Double):Double = (guess + 2.0/guess)/ 2.0




}
