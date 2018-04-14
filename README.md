# gremlin-ammonite
[Ammonite-REPL](https://ammonite.io/#Ammonite-REPL) preconfigured for [Apache TinkerPop 3](https://tinkerpop.apache.org) using [gremlin-scala](https://github.com/mpollmeier/gremlin-scala) Scala wrapper

### What's in the box?
* Scala 2.12.4
* Ammonite-REPL 1.1.0
* TinkerPop 3.3.1
* gremlin-scala 3.3.1.2

### [Download](https://github.com/banditopazzo/gremlin-ammonite/releases/download/0.3/gremlin-ammonite-0.3.jar)

### How to use:

Launch the downloaded file with:

* `java -jar filename.jar`

```scala
implicit val graph = TinkerFactory.createModern.asScala
val name = Key[String]("name")

graph.V.hasLabel("person").value(name).toList
// List(marko, vadas, josh, peter)
```

### How to run directly from sbt:

* `sbt run`

### How to create the fat jar standalone version:

* `sbt assembly`

The *jar* file will be created under */target/scala-2.12* and you can run it with:

* `java -jar filename.jar`


