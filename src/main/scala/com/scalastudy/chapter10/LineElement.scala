package com.scalastudy.chapter10

/**
 * Created by f-takahashi on 2016/01/13.
 */
class LineElement(s:String) extends ArrayElement(Array(s)){
  override def width = s.length
  override def height = 1
}
