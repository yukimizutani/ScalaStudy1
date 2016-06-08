package com.scalastudy.chapter24

import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._
import scala.language.postfixOps

object FutureSample extends App{

  val s = "Hello"

  val f:Future[String] = Future {
    Thread.sleep(5000)
    println(s"[ThreadName] In Future: ${Thread.currentThread.getName}")
    s + " future!"
  }

  f.onSuccess{
    case s: String => {
      println(s"[ThreadName] on Success: ${Thread.currentThread.getName}")
      println(s)
    }
  }

  println(f.isCompleted)

  //Thread.sleep(5000)

  Await.ready(f, 10000 millisecond)

  println(s"[ThreadName] In App ${Thread.currentThread.getName}")

  println(f.isCompleted)

  Thread.sleep(10000)
}
