package com.scalastudy.chapter19

import org.scalatest.FunSuite

class QueueTest extends FunSuite {

  test("SlowAppendQueue") {
    var a = new SlowAppendQueue[Int](List(1, 2, 3))
    a = a.enqueue(4)
    val second = a.tail
    val third = second.tail
    val fourth = third.tail
    assert(a.head === 1)
    assert(second.head === 2)
    assert(third.head === 3)
    assert(fourth.head === 4)
  }

  test("SlowHeadQueue") {
    var a = new SlowHeadQueue[Int](List(1, 2, 3))
    a = a.enqueue(4)
    val second = a.tail
    val third = second.tail
    val fourth = third.tail
    assert(a.head === 3)
    assert(second.head === 2)
    assert(third.head === 1)
    assert(fourth.head === 4)
  }

  test("Queue") {
    var a:Queue[Int] = Queue(1,2,3)
    a = a.enqueue(4)
    assert(a.head === 1)

    val b = Queue(new Apple)
    b.enqueue(new Orange)

  }

}
