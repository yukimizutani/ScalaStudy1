package com.scalastudy.chapter9

import org.scalatest.FunSuite

class FileMatcher$Test extends FunSuite {

  test("filesEnding"){
    val fileList = FileMatcher.filesEnding("scala")
    //fileList.foreach(println )
  }

  test("filesContains"){
    val fileList = FileMatcher.filesContains("a")
    //fileList.foreach(println )
  }

  test("filesRegex"){
    val fileList = FileMatcher.filesRegex(".*")
    fileList foreach println
  }




}
