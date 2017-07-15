name := "AkkaKafkaScala"

version := "1.0"

scalaVersion := "2.12.1"

val akkaVer = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVer,
  "com.typesafe.akka" %% "akka-testkit" % akkaVer % Test,
  "com.typesafe.akka" %% "akka-stream" % akkaVer,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVer % Test,
  "com.typesafe.akka" %% "akka-stream-kafka" % "0.16"
)