
credentials += Credentials(Path.userHome / ".sbt" / "central_sonatype_credentials")

ThisBuild / organization := "io.github.dotty-cps-async"
ThisBuild / organizationName := "dotty-cps-async"
ThisBuild / organizationHomepage := Some(url("https://github.com/rssh"))
ThisBuild / publishTo := localStaging.value


ThisBuild / scmInfo := Some(
       ScmInfo(
          url("https://github.com/dotty-cps-async/shim--scala-async"),
          "scm:git@github.com:dotty-cps-async/shim--scala-async--dotty-cps-async.git"
       )
)


ThisBuild / developers := List(
          Developer(
             id    = "rssh",
             name  = "Ruslan Shevchenko",
             email = "ruslan@shevchenko.kiev.ua",
             url   = url("https://github.com/rssh")
          )
)


ThisBuild / description := "shim for scala2 async/await in dotty via dotty-cps-async"
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/dotty-cps-async/shim--scala-async"))

ThisBuild / pomIncludeRepository := { _ => false }
ThisBuild / publishMavenStyle := true




