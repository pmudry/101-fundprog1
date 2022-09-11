package labs.lab01_first_steps

import utils.Input

/**
 * Ici l'idée serait tout d'abord de faire un programme pas interactif du tout.
 * On fait avec des val directement. On montre que tout cela fonctionne
 *
 * Etape suivante --> on rajoute le fait de rendre le programme interactif avec le input
 */
object FuelExercise extends App {

  print("Liters / 100 km : ")
  val consumption: Double = Input.readDouble
  print("Distance driven : ")
  val distance: Double = Input.readDouble

  // Perform the computation
  val total: Double = consumption / 100.0 * distance

  // Display the result
  println(s"For $distance km, you used : $total liters of fuel.")
}