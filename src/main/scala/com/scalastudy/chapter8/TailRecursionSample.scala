package com.scalastudy.chapter8

import scala.annotation.tailrec


object TailRecursionSample {


  def factorial(n:Int):Int = {
    if( n <= 1 )
      1
    else
      n * factorial( n-1 )
  }


  def factorialMatch(n:Int):Int =  n match {
    //case 0 | 1  => 1
    //case 0 => 1
    //case 1 => 1
    case 0 | 1 => 1
    //case i if ( i == 0 | i == 1 ) => 1
    case _ => n * factorialMatch(n - 1)
  }


  def boom(x:Int):Int =
    if(x == 0) throw new Exception("boom!")
    else boom(x-1) + 1


  @tailrec
  def bang(x:Int):Int =
    if(x == 0) throw new Exception("bang!")
    else bang(x-1)



  def factorialMatchTailRecursion(n:Int) :Int =  {
    def factorialMatch(n:Int, m:Int) :Int =  n match {
      case 0 | 1 => m
      case _ => factorialMatch(n - 1, n * m)
    }
    factorialMatch(n, 1)
  }
  //factorialMatch(4,1)
  // factorialMatch(3,4)
  //  factorialMatch(2,12)
  //   factorialMatch(1,24)
  //    24


  def fibNoRecursion(n:Int) =  {
    var a = 0
    var b = 1
    for(i <- 1 to n){
      val next = a + b
      a = b
      b = next
    }
    a
  }


  def fibRecursion(n:Int):Int = n match {
    case 0 | 1 => n
    case _ => fibRecursion(n - 1) + fibNoRecursion(n - 2)
  }


  def fibTailRecursion(n:Int):Int = {
    def fibTail(n:Int, a:Int, b:Int):Int = n match {
      case 0 => a
      case _ => fibTail(n-1, b, a+b)
    }
    fibTail(n,0,1)
  }


}
