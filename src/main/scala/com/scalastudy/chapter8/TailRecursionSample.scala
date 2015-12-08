package com.scalastudy.chapter8


object TailRecursionSample {


  def factorial(n:Int):Int = {
    if( n <= 1 )
      1
    else
      n * factorial( n-1 )
  }


  def factorialMatch(n:Int) :Int =  n match {
    //case 0 | 1  => 1
    //case 0 => 1
    //case 1 => 1
    case 0 | 1 => 1
    //case i if ( i == 0 | i == 1 ) => 1
    case _ => n * factorialMatch(n - 1)
  }




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


}
