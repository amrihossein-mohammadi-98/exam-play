package infrustructure

import com.github.tminglei.slickpg._

trait PostgresDriver extends ExPostgresProfile
  with PgArraySupport
  with PgDate2Support
  with PgPlayJsonSupport
  with PgNetSupport
  with PgLTreeSupport
  with PgRangeSupport
  with PgPostGISSupport
  with PgHStoreSupport
  with PgSearchSupport {

  override val pgjson = "jsonb"
  ///
  override val api = new API with ArrayImplicits
    with DateTimeImplicits
    with PlayJsonImplicits
    with NetImplicits
    with LTreeImplicits
    with PostGISImplicits
    with PostGISPlainImplicits
    with RangeImplicits
    with HStoreImplicits
    with SearchImplicits
    with SearchAssistants {}
}

object PostgresDriver extends PostgresDriver
