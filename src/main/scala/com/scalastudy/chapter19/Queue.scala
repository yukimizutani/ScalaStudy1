package com.scalastudy.chapter19


class SlowAppendQueue[T] (elems:List[T]) {
  def head = elems.head
  def tail= new SlowAppendQueue(elems.tail)
  def enqueue(x:T) = new SlowAppendQueue( elems ::: List(x))
}

class SlowHeadQueue[T](smeele:List[T]){
  def head = smeele.last
  def tail = new SlowHeadQueue(smeele.init)
  def enqueue(x:T) = new SlowHeadQueue(x :: smeele)
}

trait Queue[T]{
  def head:T
  def tail:Queue[T]
  def enqueue(x:T):Queue[T]
}

object Queue{
  def apply[T](xs:T*):Queue[T] = new QueueImpl[T](xs.toList, Nil)

  private  class QueueImpl[T](private val leading:List[T], private val trailing:List[T]) extends Queue[T]{
    private def mirror = {
      if(leading.isEmpty) new QueueImpl(trailing.reverse, Nil)
      else this
    }

    def head = mirror.leading.head

    def tail = {
      val q = mirror
      new QueueImpl(q.leading.tail, q.trailing)
    }

    def enqueue(x:T) = new QueueImpl(leading, x :: trailing)

  }
}

