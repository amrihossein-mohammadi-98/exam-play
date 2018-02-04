package infrustructure

import model.User
import slick.jdbc.PostgresProfile.Table
import infrustructure.PostgresDriver.api._

import play.api.db.slick.HasDatabaseConfigProvider
import slick.jdbc.JdbcProfile
import slick.lifted.Tag

trait UserComponent {self: HasDatabaseConfigProvider[JdbcProfile] =>
  class UserTable(tag:Tag) extends Table[User](tag,"my_users") {
    def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
    def name = column[Option[String]]("first_name")
    def lastName = column[Option[String]]("last_name")
    def age = column[Option[Int]]("age")

    override def * = (id , name , lastName , age) <> (User.tupled , User.unapply)
  }

}

