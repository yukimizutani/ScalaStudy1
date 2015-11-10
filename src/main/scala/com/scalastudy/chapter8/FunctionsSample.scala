package com.scalastudy.chapter8

import scala.io.Source


object FunctionsSample {

  def processFile(filename:String, width:Int): Unit = {
    def processLine(line:String): Unit ={
      if( line.length > width ){
        println(filename + ": " + line)
      }
    }

    val source = Source.fromFile(filename)
    for(line <- source.getLines()){
      processLine(line)
    }
  }



  def returnFunc():Int => Int = {
    (x:Int) => x + 1
  }

  def returnFunc2():()=> Int ={
    () => 1 + 1
  }




  var a = 0
  def closure():() => Int = {
    () => {
      a = a + 1
      a
    }
  }


  def closure2():() => Int = {
    var b = 0
    () => {
      b = b + 1
      b
    }
  }


  def closure3():(Int) => Int = {
    var c = 0
    (x:Int) => {
      c = c + x
      c
    }
  }


  def closure4(more:Int): (Int) => Int = {
    (x:Int) => {
      more + x
    }
  }


  def show(x:Option[String]) = x match {
    case Some(s) => s
    case None => "?"

  }

}

