name := "cucumber-examples-failure"

version := "0.1"

scalaVersion := "2.12.7"

// Scalatest
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % Test

// Cucumber dependencies
val cucumberVersion = "2.0.1"
libraryDependencies ++= Seq(
  "io.cucumber" %% "cucumber-scala" % cucumberVersion % Test,
  "io.cucumber" % "cucumber-junit" % cucumberVersion % Test
)
