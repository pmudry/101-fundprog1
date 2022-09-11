package courses.c000_intro

object FirstSteps extends App {

  println("Hello World !")

  var t: Int = 0

  for (i <- 1 to 100002)
    t = t + i

  println(t)
}

