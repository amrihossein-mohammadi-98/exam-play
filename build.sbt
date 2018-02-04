
name := "exam1"
 
version := "1.0"

name := """exam1"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

libraryDependencies ++= Seq( ehcache , ws , specs2 % Test , guice ,

  "org.postgresql" % "postgresql" % "9.4-1200-jdbc41",
  "com.typesafe.play" %% "play-json" % "2.6.0-M6",
  "com.typesafe.play" %% "play-iteratees" % "2.6.1",
  "com.typesafe.play" %% "play-iteratees-reactive-streams" % "2.6.1",
  "com.typesafe.play" %% "play-slick" % "3.0.0-M3",
  "com.typesafe.play" %% "play-slick-evolutions" % "3.0.0-M3",
  // "ai.x" %% "play-json-extensions" % "0.8.0",
  "com.github.tototoshi" % "play-json-naming_2.11" % "1.1.0",
  "com.vividsolutions" % "jts" % "1.13",
  "com.github.tminglei" %% "slick-pg" % "0.15.0-RC",
  "com.github.tminglei" %% "slick-pg_json4s" % "0.15.0-RC",
  "com.github.tminglei" %% "slick-pg_jts" % "0.15.0-RC",
  "com.github.tminglei" %% "slick-pg_play-json" % "0.15.0-RC",
  "io.github.nremond" %% "pbkdf2-scala" % "0.6.3",
  "org.zeromq" % "jeromq" % "0.3.5",
  "net.debasishg" %% "redisclient" % "3.4",
  "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test,
  "org.mockito" % "mockito-core" % "2.10.0" % "test",
  "com.github.stijndehaes" %% "play-prometheus-filters" % "0.3.0"
)

//unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )

      