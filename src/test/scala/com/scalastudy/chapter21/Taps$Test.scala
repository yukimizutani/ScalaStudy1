package com.scalastudy.chapter21

import org.scalatest.FunSuite
import com.scalastudy.chapter21.Taps.Tap

class Taps$Test extends FunSuite {

  test("testTap") {
    val a:List[Int] = List(-3, -2 ,-1 , 0, 1, 2, 3 ,4)
    a.tap{(x:List[Int]) => println("AAAAA " + x)}
      .filter(_ > 0)
      .tap(x => println("BBBBBB " + x))
      .filter(_ % 2 == 0)
      .tap(x => println("CCCCCC" + x))
  }

}
