package com.scalastudy.chapter7

import java.io.{FileNotFoundException, FileReader}

object BuiltinControlStructure {

  def if_formula(x:Int) = if (x > 5) x else 0

  def whileFormula(x:Int) ={
    var i = 0
    while( i < x) {
      i = i + 1
    }
  }

  def forYieldFormula(list:List[Int]) = {
    for (
      l <- list
      if l > 3
    ) yield l
  }


  def forNestFormula(x:Int , y:Int) = {
    for(
      i <- 0 to x;
      j <- 0 to y
    ) yield (i,j)
  }

  def throwException(x:Int) =
    if( x % 2 == 0) x  else throw new RuntimeException("x must be even")


  def tryCatchFormula = {
    try {
      val f = new FileReader("NotExists.txt")
      f
    } catch {
      case ex: FileNotFoundException => 0
      case ex: RuntimeException => 1
      case _:Exception => 10
    }
  }
    def matchFormula(s:String) = {
      s match {
        case "A" => 0
        case "B" => 1
        case "C" => 2
        case _ => 3
      }
  }

}