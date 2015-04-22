lazy val javainterview = (project in file(".")).settings(
  name := "javainterview",
  organization := "se.yabs",
  version := "SNAPSHOT",
  scalaVersion := "2.11.6",

  libraryDependencies ++= Seq(
    "com.novocode" % "junit-interface" % "0.11" % "test"
  )

)

