val commonSettings = Seq(
  organization := "io.mytc",
  crossScalaVersions := Seq("2.12.4"),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-Xlint",
    "-Xfatal-warnings",
    "-Yno-adapted-args",
    "-Ywarn-numeric-widen",
    "-Ywarn-unused-import"
  )
)

lazy val vm = (project in file("vm")).
  settings(
    normalizedName := "sood",
    version := "0.0.1"
  ).
  settings( commonSettings: _* ).
  settings(
    libraryDependencies ++= Seq (
      "org.scalatest"  %% "scalatest"        % "3.0.5"   % Test
    )
  )

lazy val forth = (project in file("forth")).
  settings(
    normalizedName := "forth",
    version := "0.0.1"
  ).
  enablePlugins(JavaAppPackaging).
  settings( commonSettings: _* ).
  settings(
    libraryDependencies ++= Seq (
      "com.lihaoyi"    %% "fastparse-utils"  % "1.0.0",
      "org.scalatest"  %% "scalatest"        % "3.0.5"   % Test
    )
  )