name := """play-swagger-activator-template"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

resolvers += Resolver.jcenterRepo

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test,
  "com.iheart" %% "play-swagger" % "0.4.0",
  "org.webjars" % "swagger-ui" % "2.1.4"
)


fork in run := true