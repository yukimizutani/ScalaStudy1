package com.scalastudy.chapter24

import java.util.concurrent.atomic.AtomicInteger

import scala.concurrent.{Future, Promise}
import scala.util.Random
import scala.concurrent.ExecutionContext.Implicits.global


object CountDownLatchSample extends App{

  val indexHolder = new AtomicInteger(0)
  val random = new Random()
  val promises: Seq[Promise[Int]] = for{i <- 1 to 3} yield Promise[Int]

  val futures: Seq[Future[Int]] = for{i <- 1 to 8} yield Future[Int]{
    val waitMilliSec = random.nextInt(1000)
    Thread.sleep(waitMilliSec)
    waitMilliSec
  }

  futures.foreach{
    f => f.onSuccess{
      case waitMilliSec =>
        val index = indexHolder.getAndIncrement
        if(index < promises.length){
          promises(index).success(waitMilliSec)
        }
    }
  }

  promises.foreach{
    p => p.future.onSuccess{
      case waitMilliSec => println(waitMilliSec)
    }
  }

  Thread.sleep(5000)
}
