name := "gremlin-ammonite"

version := "0.1"

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
  "org.slf4j" % "slf4j-nop" % "1.7.25" % Test,
  "org.apache.tinkerpop" % "tinkergraph-gremlin" % gremlinVersion % Test,
  "org.apache.tinkerpop" % "gremlin-test" % gremlinVersion % Test,
  "org.scalatest" %% "scalatest" % "3.0.3" % Test,
  "org.scalamock" %% "scalamock-scalatest-support" % "3.5.0" % Test,
  "com.michaelpollmeier" %% "gremlin-scala" % "3.3.1.2" % Test,
  "com.lihaoyi" % "ammonite" % "1.1.0" % "test" cross CrossVersion.full
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

sourceGenerators in Test += Def.task {
  val file = (sourceManaged in Test).value / "amm.scala"
  IO.write(file, """object amm extends App { ammonite.Main.main(args) }""")
  Seq(file)
}.taskValue

// Optional, required for the `source` command to work
(fullClasspath in Test) ++= {
  (updateClassifiers in Test).value
    .configurations
    .find(_.configuration == Test.name)
    .get
    .modules
    .flatMap(_.artifacts)
    .collect{case (a, f) if a.classifier == Some("sources") => f}
}