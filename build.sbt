val scala3Version = "3.7.3"

logo := Welcome.logo
usefulTasks := Welcome.tasks

lazy val root = project
  .in(file("."))
  .settings(
    name := "tcloak",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0" % Test,
    libraryDependencies += "com.github.scopt" %% "scopt" % "4.1.0"
  )
