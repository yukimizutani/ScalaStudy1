package com.scalastudy.chapter15

import org.scalatest.FunSuite
import com.scalastudy.chapter15.Opt._


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

  test("testoption"){

    def sum(xs:List[Int]):Int = (0 /: xs)(_ + _)
    def product(xs: List[Int]):Int = (1 /: xs)(_ * _)

    assert(sum(List(1,2,3)) === 0 + 1 + 2 + 3)
    assert(product(List(1,2,3)) === 1 * 2 * 3)

    assert(toInt("1") === Some(1))
    assert(toInt("a") === None)

    assert(readText("not_exists.txt") === None)

  }


}
