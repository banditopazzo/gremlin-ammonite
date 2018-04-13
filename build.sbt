name := "gremlin-ammonite"

version := "0.2"

scalaVersion := "2.12.4"
crossScalaVersions := Seq(scalaVersion.value, "2.11.12")
val gremlinVersion = "3.3.1"

resolvers ++= Seq(
  Resolver.mavenLocal,
  "Apache public".at("https://repository.apache.org/content/groups/public/"),
  "Gremlin Scala".at("https://github.com/mpollmeier/gremlin-scala/releases/")
)

libraryDependencies ++= Seq(
  "org.apache.tinkerpop" % "gremlin-core" % gremlinVersion,
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "com.chuusai" %% "shapeless" % "2.3.3",
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6", //just specified to eliminate sbt warnings
  "org.slf4j" % "slf4j-nop" % "1.7.25",
  "org.apache.tinkerpop" % "tinkergraph-gremlin" % gremlinVersion ,
  "org.apache.tinkerpop" % "gremlin-test" % gremlinVersion ,
  "org.apache.tinkerpop" % "gremlin-driver" % gremlinVersion,
  "org.scalatest" %% "scalatest" % "3.0.3",
  "org.scalamock" %% "scalamock-scalatest-support" % "3.5.0",
  "com.michaelpollmeier" %% "gremlin-scala" % "3.3.1.2",
  "com.lihaoyi" % "ammonite" % "1.1.0" cross CrossVersion.full
)

scalacOptions ++= Seq(
  // "-Xlint"
  // "-Xfatal-warnings",
  // , "-Xlog-implicits"
  //"-Ydebug",
  "-language:implicitConversions",
  "-language:existentials",
  "-feature",
  "-deprecation" //hard to handle when supporting multiple scala versions...
)