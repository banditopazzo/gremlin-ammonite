
object app {
  def main(args: Array[String]): Unit = {

    // Setup initial params
    val initParams = List(
      "repl.prompt() = \"gremlin@scala> \"",                    // Set different prompt
      readImportsFromResources("imports.sc"),     // Load imports
      readImportsFromResources("additional.sc")   // Load additional conf
    ).mkString("\n")

    // Break into debug REPL with
    ammonite.Main(
      predefCode = initParams
    ).run()

  }

  def readImportsFromResources(resourceName: String): String = {
    val file = getClass.getClassLoader.getResourceAsStream(resourceName)
    scala.io.Source.fromInputStream(file).mkString
  }

}
