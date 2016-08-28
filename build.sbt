organization := "io.brain-garden"

name := "data-admin"

version := "0.1"

scalaVersion := "2.11.8"

//scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaV       = "2.4.9"
  val scalaTestV  = "3.0.0"
  Seq(
    "com.typesafe"       % "config"                               % "1.3.0",
    "com.typesafe.akka" %% "akka-http-core"                       % akkaV,
    "com.typesafe.akka" %% "akka-stream"                          % akkaV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental"    % akkaV,
    "com.typesafe.akka" %% "akka-http-testkit-experimental"       % "2.4.2-RC3",
    "com.google.inject"  % "guice"                                % "4.1.0",
    "org.scalatest"     %% "scalatest"                            % scalaTestV % "test"
  )
}


fork in run := true