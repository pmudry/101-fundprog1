package labs.lab04_guess_number

import utils.Input

object SecretNumber extends App {

  def displayMenu(): Unit = {
    println("Choose difficulty :")
    println("\t (1) Rookie level \t (1 to 10)")
    println("\t (2) Easy level \t (1 to 100)")
    println("\t (3) Human level \t (1 to 1000)")
    println("\t (4) Nightmare level \t (1 to 10000)")
  }

  /**
   * A more advanced version of the menu, for advanced students
   */
  def displayMenuAdvanced(names: List[String]): Unit = {
    var i: Int = 1

    println("Choose difficulty :")

    for (name <- names) {
      println(s"\t ($i) $name level \t (1 to ${Math.pow(10.0, i)})")
      i += 1
    }
  }

  displayMenuAdvanced(List("Rookie", "Easy", "Human", "Hell"))

  val number : Int = Input.readInt
  println(s"you chose $number")

}