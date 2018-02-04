package repository

import javax.inject.Inject

import infrustructure.{PostgresDriver, UserComponent}
import slick.lifted.TableQuery
import slick.jdbc.GetResult
import play.api.db.slick.{DatabaseConfigProvider, HasDatabaseConfigProvider}

import scala.concurrent.{ExecutionContext, Future}
import infrustructure.PostgresDriver.api._
import model.User
import slick.jdbc.JdbcProfile


class UserRepo @Inject()(protected val dbConfigProvider : DatabaseConfigProvider)(implicit val ec: ExecutionContext) extends UserComponent with
HasDatabaseConfigProvider[JdbcProfile]{

//  val db :PostgresDriver.backend.DatabaseDef = PostgresDriver.backend.Database.forConfig("db")

   def creatUser(name: String): Future[User] = {
    val user = TableQuery[UserTable]
    val query = user returning user.map(_.id) into ((item, id) => item.copy(id = id))
//    implicit val getUserResult = GetResult(r => User(r.<<, r.<<, r.<<))

     println("in the func")
    val action = query += User(id=1,name = Option(name),lastName = Option("Eslami"),age=Option(22))
    db.run(action)

  }
}
