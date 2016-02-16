package com.scalastudy.chapter15

import org.scalatest.FunSuite

class UserRepository$Test extends FunSuite {

  test("testFindById") {
    val sampleUser = UserRepository.findById(10)
    val defaultUser = User(0, "anonymous", "anonymous", 0,None)
    val a = sampleUser.getOrElse(defaultUser).firstName
    assert(a === "anonymous")

    val user1 = UserRepository.findById(1)
    val b = user1.getOrElse(defaultUser).firstName
    assert(b === "Fukusuke")
    //if(sampleUser != null) {
    //  sampleUser.get.firstName
    //}

    val user2 = UserRepository.findById(2)
    val c = user2.get.gender match {
      case Some(x) => x
      case None => "NOGENDER"
    }
    assert(c === "NOGENDER")

  }

  test("testFindAll") {

  }

}
