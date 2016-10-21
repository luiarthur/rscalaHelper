# rscalaHelper
My helpers for [rscala](https://dahl-git.byu.edu/dahl/rscala/) by David B. Dahl.

- Prints results from `R` in Scala console
- Note that you can change the RLib path by `R.eval(".libPaths('path/to/RLib')")` in Scala

## Usage
```scala
import RHelper._

val R = org.ddahl.rscala.RClient()
R.eval("set.seed(123)")
R.print("rnorm(10)")
// output from R will be printed in Scala console:
// [1] -0.56047565 -0.23017749  1.55870831  0.07050839  0.12928774  1.71506499
// [7]  0.46091621 -1.26506123 -0.68685285 -0.44566197  
```
