package com.scalastudy.chapter24

import scala.concurrent.Future
import scala.util.{Failure, Random, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object FutureOptionUsageSample extends App{

  val random = new Random()
  val waitMaxMilliSec = 3000

  val futureMilliSec : Future[Int] = Future {
    println("Future futureMilliSec started")
    println(s"[ThreadName] futureMilliSec: ${Thread.currentThread.getName}")
    val waitMilliSec = random.nextInt(waitMaxMilliSec)
    if(waitMilliSec < 1000) throw new RuntimeException(s"waitMilliSec is ${waitMilliSec}")
    Thread.sleep(waitMilliSec)
    waitMilliSec
  }

  println("running ...")

//  val futureSec: Future[Double] = futureMilliSec.map((i:Int) => {
//    Thread.sleep(1000)
//    println(s"[ThreadName] map executing .. : ${Thread.currentThread.getName}")
//    i.toDouble / 1000
//  })

  val futureSec: Future[Double] = futureMilliSec.flatMap{
    i => Future {
      Thread.sleep(1000)
      println(s"[ThreadName] flatMap executing .. : ${Thread.currentThread.getName}")
      i.toDouble / 1000
    }
  }

  futureSec onComplete {
    case Success(waitSec) => println(s"Success! ${waitSec} sec")
    case Failure(t) => println(s"Failure! ${t.getMessage}")
  }

  var i = 0
  while( i < 10){
    Thread.sleep(1000)
    println("main thread running." + i)
    i = i + 1
  }



}
