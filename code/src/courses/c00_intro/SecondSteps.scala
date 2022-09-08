package courses.c00_intro

import exos.Prout

@main
def begin() = {
  /**
   * 1.
   * Choses à constater
   * Ca imprime 3 lignes
   * Ca revient à ligne à chaque fois
   * C'est le même texte
   */
  println("Hello, World")
  println("This is our first code")
  println("and everything is fine")

  /**
   * 1b. Visiblement on peut faire des petits calculs
   */
  println(11 + 22)

  /**
   * 1c. Visiblement pour que cela se voie il faut faire un
   * println
   */
  15 + 30

  /**
   * 1d. Là ça se voit
   */
  println(15+30)

  val foo = 11
  val bar = 22
  val toto = foo + bar

  /**
   * 2.
   * Si je fais ça les opérations ci-dessus et j'exécute, on voit rien (pas de
   * println)
   */

  /**
   * 3.
   * Pour voir, il faut faire un print et là on a le résultat du calcul, 33
   */
  println(toto)

}