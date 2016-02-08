package com.scalastudy.chapter15


sealed  abstract  class DayOfWeek

case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object TuesDAy extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek

object Obj {

  def returnInt(x:DayOfWeek) :Int = x match {
    case Sunday => 1
    case Monday => 2
    case TuesDAy => 3
    case Wednesday => 4
    case Thursday => 5
    case Friday => 6
    case Saturday => 7
  }

}