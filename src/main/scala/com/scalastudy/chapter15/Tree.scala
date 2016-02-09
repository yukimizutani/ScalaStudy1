package com.scalastudy.chapter15

sealed abstract class Tree
case class Branch(value:Int, left:Tree, right:Tree) extends Tree
case object Empty extends Tree

object Tree{

  def max(tree:Tree):Int = tree match {
    case Branch(v:Int,Empty,Empty) => v
    case Branch(v:Int,l:Branch,r:Branch) => {
      val lm = max(l)
      val rm = max(r)
      if (v > lm && v > rm) v
      else if (lm > rm) lm
      else rm
    }
    case _ => 0
  }

  def min(tree:Tree):Int = tree match {
    case Branch(v:Int, Empty, Empty) => v
    case Branch(v:Int, l:Branch, r:Branch) => {
      val lm = min(l)
      val rm = min(r)
      if (v < lm && v < rm) v
      else if (lm < rm ) lm
      else rm
    }
    case _ => java.lang.Integer.MAX_VALUE
  }

  def depth(tree:Tree):Int = tree match {
    case Branch(v:Int, Empty, Empty) => 1
    case Branch(v:Int, l:Branch, r:Branch) => 1 + depth(l) + depth(r)
    case _ => 0

  }

}
