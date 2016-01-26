package com.scalastudy.chapter12

abstract class Bird {
  def name:String = this.getClass.getSimpleName
}

trait Swimming{
  def swim() = println("I'm swimming.")
}

trait Flying{
  def flymessage:String
  def fly() = println(flymessage)
}


class Pigeon extends Bird with Swimming with Flying{
  val flymessage = "I'm a good flyer."
}

class Hawk extends Bird with Swimming {
  val flymessage = "I'm a excellent flyer."
}

class Penguin extends Bird with Swimming{
}
