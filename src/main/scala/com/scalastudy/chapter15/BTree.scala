package com.scalastudy.chapter15

object  BTree {
  sealed abstract class Tree
  case class Branch(value:Int, left:Tree, right:Tree) extends Tree
  case object Empty extends Tree


  def max(t:Tree):Int = t match {
    case Branch(v,Empty, Empty) => v
    case Branch(v1,Branch(v2, Empty, Empty), Empty) => if (v1 > v2) v1 else v2
    case Branch(v1, Empty,Branch(v2, Empty, Empty)) => if (v1 > v2) v1 else v2
    case Branch(v, lBranch, rBranch) => {
      val lm = max(lBranch)
      val rm = max(rBranch)
      val lrm = if (lm > rm) lm else rm
      if(v > lrm ) v else lrm
    }
    case _ => 0
  }

  def min(t:Tree):Int = 0

}
