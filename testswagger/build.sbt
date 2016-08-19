name := """testswagger"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.iheart" %% "play-swagger" % "0.2.1-PLAY2.5",
  "org.webjars" % "swagger-ui" % "2.1.4"
)
