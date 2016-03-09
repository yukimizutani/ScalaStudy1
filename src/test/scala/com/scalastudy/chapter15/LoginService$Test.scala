package com.scalastudy.chapter15

import org.scalatest.FunSuite


class LoginService$Test extends FunSuite {

  test("testLogin") {
    LoginService.login(name = "dwango", password = "password") match {
      case Right(user) => println(s"${user.id}")
      case Left(InvalidPassword) => println(s"Invalid password!")
    }
  }

}
