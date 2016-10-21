# rscalaHelper
My helpers for [rscala](https://dahl-git.byu.edu/dahl/rscala/) by David B. Dahl
- print results from `R`

I mainly just use Rscala for plotting and comparing results of standard R methods
like `lm`, `glm`. As long as rscala is included in sbt / classpath, things should run fine.

## Usage
```scala
import rscalaHelper._

RH.r("set.seed(123)")
RH.r("rnorm(10)")
// output:
// [1] -0.56047565 -0.23017749  1.55870831  0.07050839  0.12928774  1.71506499
// [7]  0.46091621 -1.26506123 -0.68685285 -0.44566197  

RH.R.eval("x <- rnorm(100)") // original RClient is still available.
```
