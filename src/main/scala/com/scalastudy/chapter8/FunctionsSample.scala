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



  def sum(a:Int,b:Int,c:Int) = a + b + c


  def echo(args:String*) =
    for (arg <- args) println(arg)


  def speed(distance:Float = 0.5F, time:Float) : Float =
    distance / time


}

