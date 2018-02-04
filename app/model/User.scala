package model

case class User (
                  id: Long = 1,
                name:Option[String] = None,
                lastName:Option[String] = None,
                age:Option[Int] = None
                )
