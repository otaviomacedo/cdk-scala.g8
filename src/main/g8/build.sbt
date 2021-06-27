val scala3Version = "3.0.0"

lazy val root = project
  .in(file("."))
  .settings(
    name := "myapp",
    version := "0.1",

    scalaVersion := scala3Version,

    libraryDependencies += "org.assertj" % "assertj-core" % "3.18.1" % "test",
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",
    libraryDependencies += "software.amazon.awscdk" % "core" % "1.109.0",

    Compile / run / mainClass := Some("com.myorg.ScalaCdkApp")

  )