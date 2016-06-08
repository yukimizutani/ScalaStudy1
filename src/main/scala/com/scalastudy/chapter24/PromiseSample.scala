package com.scalastudy.chapter24


import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Random, Success}

object PromiseSample extends App{
  val random = new Random()
  val promiseGetInt:Promise[Int] = Promise[Int]

  val firstFuture: Future[Int] = Future {
    Thread.sleep(100)
    1
  }
  firstFuture.onSuccess{ case i => promiseGetInt.trySuccess(i)}

  val secondFuture: Future[Int] = Future {
    Thread.sleep(200)
    2
  }
  secondFuture.onSuccess{ case i => promiseGetInt.trySuccess(i)}

  val futureGetInt:Future[Int] = promiseGetInt.future

  futureGetInt.onComplete{
    case Success(i) => println(s"Success! ${i}")
    case Failure(t) => println(t.getMessage)
  }

  Thread.sleep(1000)
}
