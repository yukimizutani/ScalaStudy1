package com.scalastudy.chapter24

import scala.concurrent.{Future, Promise}
import scala.util.{Failure, Random, Success}
import scala.concurrent.ExecutionContext.Implicits.global

object PromiseSample extends App{
  val random = new Random()
  val promiseGetInt: Promise[Int] = Promise[Int]

  val futureGetInt:Future[Int] = promiseGetInt.failure(new RuntimeException()).future

  futureGetInt.onComplete{
    case Success(i) => println(s"Succcess! i:${i}")
    case Failure(t) => println(s"Failure! ${t.getMessage}")
  }

  Thread.sleep(5000)
}
