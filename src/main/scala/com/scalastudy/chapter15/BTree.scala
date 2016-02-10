package com.scalastudy.chapter15


object BTree {
  sealed abstract class Tree
  case class Branch(value:Int, left: Tree, right:Tree) extends Tree
  case object Empty extends Tree

  def max(t:Tree):Int = t match {
    case Branch(v1, Empty, Empty) => v1
    case Branch(v1, Branch(v2,Empty,Empty), Empty) => if(v1 > v2) v1 else v2
    case Branch(v1, Empty, Branch(v2, Empty, Empty)) => if(v1 > v2) v1 else v2
    case Branch(v1, l, r) =>
      val lmax = max(l)
      val rmax = max(r)
      val lrmax = if(lmax > rmax) lmax else rmax
      if(v1 > lrmax) v1 else lrmax
    case Empty => throw new RuntimeException
  }

  def min(t:Tree):Int =  t match {
    case Branch(v1, Empty, Empty) => v1
    case Branch(v1, Branch(v2,Empty,Empty), Empty) => if(v1 < v2) v1 else v2
    case Branch(v1, Empty, Branch(v2, Empty, Empty)) => if(v1 < v2) v1 else v2
    case Branch(v1, l, r) =>
      val lmin = min(l)
      val rmin = min(r)
      val lrmin = if(lmin < rmin) lmin else rmin
      if(v1 < lrmin) v1 else lrmin
    case Empty => throw new RuntimeException
  }

  def depth(t:Tree):Tree = Empty
}
