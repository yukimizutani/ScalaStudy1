package com.scalastudy.chapter12

import org.scalatest.FunSuite

class IntQueueTest extends FunSuite {

  test("intQueue"){
    val a = new BasicQueue
    a.put(10)
    a.put(20)
    assert(a.get() === 10)
    assert(a.get() === 20)

    val b = new MyQueue
    b.put(10)
    b.put(20)
    assert(b.get() === 20)
    assert(b.get() === 40)

    val q = new BasicQueue with  Filtering with Incrementing
    q.put(-1)
    q.put(0)
    q.put(1)
    assert(q.get() === 0)
    assert(q.get() === 1)
  }

}
