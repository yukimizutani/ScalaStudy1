package com.scalastudy.chapter12


abstract class Bird

trait Flying{
  def flymessage:String
  def fly() = println(flymessage)
}

trait Swimming {
  def swim() = println("I'm swimming.")
}

class Pegeon extends Bird with Swimming {
  val flymessage = "I'm a flyer"
}

class Hawk extends Bird with Swimming with Flying{
  val flymessage = "I'm a excellent flyer"
}

class FrigateBird extends Bird with Flying{
  val flymessage = "I'm a excellent flyer"
}

class Penguin extends Bird with Swimming