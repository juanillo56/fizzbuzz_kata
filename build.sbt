
name := """fizzbuzzkata"""

version := "1.0-SNAPSHOT"


resolvers += "Typesafe repository" at "http://repo.typesafe.com/typesafe/releases/"

resolvers += Classpaths.sbtPluginReleases

instrumentSettings

ScoverageKeys.highlighting := true

ScoverageKeys.minimumCoverage := 70

ScoverageKeys.excludedPackages in ScoverageCompile := "<empty>;Reverse.*"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)
