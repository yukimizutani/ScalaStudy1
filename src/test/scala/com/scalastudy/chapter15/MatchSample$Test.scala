package com.scalastudy.chapter15

import java.io.File
import java.nio.file.Files

import org.scalatest.FunSuite
import com.scalastudy.chapter15.MatchSample._

class MatchSample$Test extends FunSuite {

  test("wild"){
    assert(wild("avc") === 2)
    assert(wild(10) === 1)
    assert(wild(10.1) === 1)
    assert(wild('a') === 1)
  }

  test("const"){
    assert(const(5) === "five")
    assert(const(true) === "truth")
    assert(const(Nil) === "the empty list" )
    assert(const(10) === "something else" )
  }

  test("variable"){
    assert(variable(0) === "zero")
    assert(variable(1) ===  "not zero:1")
    val a = variable(10.1)
    print(a)
  }

  test("seq"){
    val a = List(0 ,10 ,20)
    val b = List(1, 10, 20)
    val c = List(0, "abc")
    val d = List(0, 1, 2, 3, 4)

    //assert(seq(a) === 1)
    //assert(seq(b) === 0)
    assert(seq(c) === 2)
    //assert(seq(d) === 1)
  }

  test("tuple"){
    val a = (1,2,10.5)
    val b = 10
    val c = (1,2, 3, 4)
    val d = (0, "abc", 1000)
//    assert(tuple(a) === 0)
//    assert(tuple(b) === 0)
//    assert(tuple(c) === 0)
    assert(tuple(d) === 1)
  }

  test("erasure"){
    val a = Map( 1 -> "a")
    assert(erasure(a) === 1)
  }

  test("regex matching"){
    def recursive(fileList:List[File]):List[String] = fileList match {
      case h :: tail => {
        if (h.isDirectory) recursive(h.listFiles().toList) ::: recursive(tail)
        else h.getAbsolutePath :: recursive(tail)
      }
      case _ => Nil
    }
    val a = new File(".").listFiles().toList
    val fileList = recursive(a)
    for(f <- fileList) {
      regexMatch(f)
    }

  }



}
