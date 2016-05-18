package com.scalastudy.chapter21

class PreferredPrompt(val preference:String)
class PreferredDrink(val preference:String)

object Greeter{
  implicit val prompt = new PreferredPrompt("Yes, master>")
  implicit val dring = new PreferredDrink("tea")
  def greet(name:String)(implicit prompt: PreferredPrompt, drink:PreferredDrink): Unit ={
    println("Welcome, " + name + ". The system is ready.")
    println(prompt.preference)
    println(drink.preference)
  }

  def maxListUpperBound[T <: Ordered[T]](elements:List[T]):T =
    elements match {
      case List() => throw new IllegalArgumentException
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListUpperBound(rest)
        if(x > maxRest) x
        else maxRest
    }


  def maxListImpParam[T](element:List[T])(implicit orderer:T => Ordered[T]):T =
    element match {
      case List() => throw new IllegalArgumentException
      case List(x) => x
      case x :: rest =>
        val maxRest = maxListImpParam(rest)(orderer)
        if(orderer(x) > maxRest) x
        else maxRest
    }


}
