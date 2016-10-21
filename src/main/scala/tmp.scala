package rscalaHelper

object RH {
  val R = org.ddahl.rscala.RClient()
  println("Remember to set R> .libPaths(pathToRLibs)~")

  def r (s: String, thresh: Int = 100, showfirst: Int = 10, showlast: Int = 10) {
    R.eval("captcha <- capture.output(" + s + ")")

    val out = R.getS1("captcha").toList

    val printOut = if (out.size > thresh) out.take(showfirst) ++ List.fill(3)("    .") ++ out.takeRight(showlast) else out

    printOut.foreach{println}
  }

}
