name := "gremlin-ammonite"

version := "0.3"

scalaVersion := "2.12.4"
crossScalaVersions := Seq(scalaVersion.value, "2.11.12")
val gremlinVersion = "3.3.1"

resolvers ++= Seq(
  Resolver.mavenLocal,
  "Apache public".at("https://repository.apache.org/content/groups/public/"),
  "Sonartype public".at("https://oss.sonatype.org/service/local/staging/deploy/maven2/")
)

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % "1.0.6", //just specified to eliminate sbt warnings
  "org.slf4j" % "slf4j-nop" % "1.7.25",
  "org.apache.tinkerpop" % "tinkergraph-gremlin" % gremlinVersion,
  "org.apache.tinkerpop" % "gremlin-driver" % gremlinVersion,
  "com.michaelpollmeier" %% "gremlin-scala" % "3.3.1.2",
  "com.lihaoyi" %% "ammonite" % "1.1.0" cross CrossVersion.full
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