//Gremlin Scala
import gremlin.scala._

//Same as official Gremlin Console
import org.apache.tinkerpop.gremlin.structure._
import org.apache.tinkerpop.gremlin.structure.util._
import org.apache.tinkerpop.gremlin.process.traversal._
import org.apache.tinkerpop.gremlin.process.traversal.step._
import org.apache.tinkerpop.gremlin.process.remote._
import org.apache.tinkerpop.gremlin.structure.util.empty._
import org.apache.tinkerpop.gremlin.structure.io._
import org.apache.tinkerpop.gremlin.structure.io.graphml._
import org.apache.tinkerpop.gremlin.structure.io.graphson._
import org.apache.tinkerpop.gremlin.structure.io.gryo._
import org.apache.commons.configuration._
import org.apache.tinkerpop.gremlin.process.traversal.strategy.decoration._
import org.apache.tinkerpop.gremlin.process.traversal.strategy.optimization._
import org.apache.tinkerpop.gremlin.process.traversal.strategy.finalization._
import org.apache.tinkerpop.gremlin.process.traversal.strategy.verification._
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph._
import org.apache.tinkerpop.gremlin.process.traversal.util._
import org.apache.tinkerpop.gremlin.process.computer._
import org.apache.tinkerpop.gremlin.process.computer.bulkdumping._
import org.apache.tinkerpop.gremlin.process.computer.bulkloading._
import org.apache.tinkerpop.gremlin.process.computer.clustering.peerpressure._
import org.apache.tinkerpop.gremlin.process.computer.traversal._
import org.apache.tinkerpop.gremlin.process.computer.ranking.pagerank._
import org.apache.tinkerpop.gremlin.process.computer.traversal.strategy.optimization._
import org.apache.tinkerpop.gremlin.process.computer.traversal.strategy.decoration._
import org.apache.tinkerpop.gremlin.util._
import org.apache.tinkerpop.gremlin.util.iterator._
import org.apache.tinkerpop.gremlin.util.function._
import org.apache.tinkerpop.gremlin.tinkergraph.structure._
import org.apache.tinkerpop.gremlin.tinkergraph.process.computer._
import org.apache.tinkerpop.gremlin.driver._
import org.apache.tinkerpop.gremlin.driver.exception._
import org.apache.tinkerpop.gremlin.driver.message._
import org.apache.tinkerpop.gremlin.driver.ser._
import org.apache.tinkerpop.gremlin.driver.remote._

// Static in official Gremlin Console
import org.apache.tinkerpop.gremlin.structure.io.IoCore._
import org.apache.tinkerpop.gremlin.process.traversal.P._
import org.apache.tinkerpop.gremlin.process.traversal.dsl.graph.__._
import org.apache.tinkerpop.gremlin.process.computer.Computer._
import org.apache.tinkerpop.gremlin.util.TimeUtil._
import org.apache.tinkerpop.gremlin.util.function.Lambda._
import org.apache.tinkerpop.gremlin.process.traversal.SackFunctions.Barrier._
import org.apache.tinkerpop.gremlin.structure.VertexProperty.Cardinality._
import org.apache.tinkerpop.gremlin.structure.Column._
import org.apache.tinkerpop.gremlin.structure.Direction._
import org.apache.tinkerpop.gremlin.process.traversal.Operator._
import org.apache.tinkerpop.gremlin.process.traversal.Order._
import org.apache.tinkerpop.gremlin.process.traversal.Pop._
import org.apache.tinkerpop.gremlin.process.traversal.Scope._
import org.apache.tinkerpop.gremlin.structure.T._
import org.apache.tinkerpop.gremlin.process.traversal.step.TraversalOptionParent.Pick._
