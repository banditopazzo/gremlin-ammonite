# gremlin-ammonite
[Ammonite-REPL](https://ammonite.io/#Ammonite-REPL) preconfigured for [Apache TinkerPop 3](https://tinkerpop.apache.org) using [gremlin-scala](https://github.com/mpollmeier/gremlin-scala) Scala wrapper

### What's in the box?
* Scala 2.12.4
* Ammonite-REPL 1.1.0
* TinkerPop 3.3.1

### How to use
* `sbt test:console`
```scala
import gremlin.scala._
import org.apache.tinkerpop.gremlin.tinkergraph.structure.TinkerFactory
implicit val graph = TinkerFactory.createModern.asScala
val name = Key[String]("name")

graph.V.hasLabel("person").value(name).toList
// List(marko, vadas, josh, peter)
```
