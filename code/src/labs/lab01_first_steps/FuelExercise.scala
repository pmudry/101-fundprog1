package labs.lab01_first_steps

import utils.Input

object FuelExercise extends App{

  print("Liters / 100 km : ")
  val consumption : Double = Input.readDouble
  print("Distance driven : ")
  val distance : Double = Input.readDouble

  // Perform the computation
  val total : Double = consumption / 100.0 * distance

  // Display the result
  println(s"For $distance km, you used : $total liters of fuel.")
}