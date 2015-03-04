
name := "scala-file-utils"

version := "0.1"
     
scalaVersion := "2.11.5"

javacOptions ++= Seq("-target", "1.7")

libraryDependencies ++= {
  Seq(
    "org.specs2" %% "specs2" % "2.3.12" % "test"
  )
}

