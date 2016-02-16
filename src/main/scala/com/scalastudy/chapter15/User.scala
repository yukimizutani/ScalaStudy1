package com.scalastudy.chapter15

case class User (
  id:Int,
  firstName:String,
  lastName:String,
  age:Int,
  gender:Option[String]
)

object UserRepository{
  private val users =  Map(1 -> User(1, "Fukusuke", "Takahashi", 29, Some("Men")),
                           2 -> User(2, "Hanako", "Tanaka", 0, None))

  def findById(id:Int):Option[User] = users.get(id)
  def findAll = users.values
}
