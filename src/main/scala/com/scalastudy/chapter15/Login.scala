package com.scalastudy.chapter15


sealed trait LoginError
case object InvalidPassword extends LoginError
case object UserNotFound extends LoginError
case object PasswordLocked extends LoginError

case class User(id: Long, name:String, password:String)

object LoginService {


  val userDatabase:Map[String,User] = Map(
    "userA" -> User(1l, "userA", "passa"),
    "userB" -> User(2l, "userB", "passb") ,
    "userC" -> User(3l, "userC", "passc")

  )

  def login(name:String, passwword:String):Either[LoginError, User] =
    userDatabase.get(name) match {
      case Some(u) => Right(u)
      case None => Left(UserNotFound)
    }
}