package com.scalastudy.chapter24

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future
import scala.util.{Failure, Random, Success}

object CompositeFutureSample extends App{

  val random = new Random()
  val waitMaxMilliSec = 3000

  def waitRandom(futureName:String):Int ={
    println(futureName + s" waitRandom start .. ${Thread.currentThread.getName}")
    val waitMilliSec = random.nextInt(waitMaxMilliSec)
    if(waitMilliSec < 500) throw new RuntimeException("error")
    Thread.sleep(waitMilliSec)
    println(futureName + s" waitRandom end .. ${Thread.currentThread.getName}")
    waitMilliSec
  }

  val futureFirst: Future[Int] = Future{ waitRandom("first")}
  val futureSecond: Future[Int] = Future{ waitRandom("second")}

  val compositeFuture:Future[(Int, Int)] = for{
    first:Int <- futureFirst
    second: Int <- futureSecond
  } yield (first, second)

  compositeFuture onComplete{
    case Success((first, second)) => println(s"Success! first:${first} second:${second}")
    case Failure(t) => println(s"Failure! ${t.getMessage}")
  }

  Thread.sleep(1000)

}
