object RHelper {
  println(Console.CYAN + "Note: You can add missing R-library paths by:\n" + 
    "scala> R.eval(\".libPaths('path/to/RLib')\")" + Console.RESET)
  implicit class RClientImprovement(R: org.ddahl.rscala.RClient) {
    def print(s: String, thresh: Int=100, showfirst: Int=10, showlast: Int=10) {
      R.eval("captcha <- capture.output(" + s + ")")
      val out = R.getS1("captcha").toList
      val printOut = if (out.size > thresh) out.take(showfirst) ++ List.fill(3)("    .") ++ out.takeRight(showlast) else out
      printOut.foreach{println}
    }
  }
}
