
val dottyVersion =  "3.3.6"

lazy val root = project
  .in(file("."))
  .settings(
    name := "shim--scala-async",
    organization := "io.github.dotty-cps-async",
    version := "1.0.2",
    scalaVersion := dottyVersion,

    libraryDependencies += "com.github.sbt" % "junit-interface" % "0.13.3" % "test",


    libraryDependencies += "io.github.dotty-cps-async" %% "dotty-cps-async" % "1.0.2" 

  )

