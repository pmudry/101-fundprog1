package courses.c00_intro

object FirstSteps extends App {

  println("Hello World !")

  var t = 0

  for (i <- 1 to 100000)
    t = t + i

  println(t)

}