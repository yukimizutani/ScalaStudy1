package com.scalastudy.chapter15

import org.scalatest.FunSuite


class TestOption extends FunSuite{
  test("option"){
    val a:Option[String] = Some("abc")
    assert(a.isEmpty === false)
    assert(a.isDefined === true)
    assert(a.get === "abc")

    val capital = Map("France" -> "Paris", "Japan" -> "Tokyo" )
    assert(capital.get("Japan") === Some("Tokyo"))
    assert(capital.get("China") === None)
    assert(capital.getOrElse("China", "Not difined.") === "Not difined.")

    val c:Option[Any] = None
    assert(c.getOrElse("Nothing") === "Nothing")

    val d = a match {
      case Some(e) => e + "***"
      case None => "?"
    }
    assert(d === "abc***")


  }


}
