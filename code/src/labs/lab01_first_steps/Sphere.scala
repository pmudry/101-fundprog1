package labs.lab01_first_steps

import utils.Input

/**
 * Questions :
 * que se passe-t-il si on ne met pas : Double par exemple ?
 * il y a visiblement deux manière d'afficher quelque chose sur la consol, lesquuelles ? (c'est la diff entre string
 * interpolation et la concaténation))
 */

object Sphere extends App {
  println("Please enter outer sphere radius (in cm): ")
  val radius: Double = Input.readDouble
  val volume: Double = radius * radius * radius * Math.PI * 4.0 / 3.0

  println("Please enter surface thickness (in cm): ")
  val thickness: Double = Input.readDouble
  val innerRadius: Double = radius - thickness

  println("External volume: " + volume + " cm3")
  println("Enter material density (in g/cm3): ")

  val mv: Double = Input.readDouble
  val shellVolume: Double = volume - innerRadius * innerRadius * innerRadius * Math.PI * 4.0 / 3.0
  val shellMass: Double = shellVolume * mv
  val density: Double = shellMass / volume

  if (density > 1.0)
    println(s"Total density: $density => The object doesn't float")
  else
    println(s"Total density: $density => The object is floating")
}

/*
 *
 * Tâche 4:
 *
 * Nous voudrions écrire un programme qui permet de déterminer si une sphère en
 * métal creuse flotte si on la plonge dans l'eau. Il doit être possible de
 * choisir la matière qui compose la sphère, l'utilisateur devra donc saisir la
 * masse volumique de cette matière. (Par exemple, la masse volumique de
 * l'aluminum est de 2.6 g/cm3) L'utilisateur doit donc saisir le rayon de la
 * sphère, l'épaisseur de la surface et la masse volumique. A partir de ces
 * données, calculez le volume total de la sphère ainsi que la masse de la
 * sphère creuse. Si le rapport entre la masse et le volume est supérieure à 1,
 * on peut considérer que l'objet flotte.
 *
 * Un exemple d'execution nous donnerai:
 *
 * Please enter sphere radius (in cm): 15 Please enter surface thickness (in
 * cm): 1 Total volume: 14130.0 cm3 Enter material density (in g/cm3): 2 Total
 * object density: 0.37392592592592594 => The object is floating
 *
 * Wir wollen ein Program schreiben, das bestimmen soll ob eine hohle Kugel
 * schwimmt wenn mann sie in Wasser taucht. Der Benutzer muss auch die Materie
 * auswählen, indem das Objekt besteht. Dafüt muss er die Dichte dieser Materie
 * angeben. (Für Aluminum ist zum Beispiel die Dichte von 2.6 g/cm3) Das Program
 * soll also folgender Weise ablaufen: Der Benutzer gibt den Radius, die Dicke
 * der Oberfläche und die Dichte der Materie ein. Mit diesen Daten sollen sie
 * den Totalvolum und die Masse der hohlen Kugel ausrechnen. Wenn das Verhältnis
 * zwischen Masse und Volum grösser als 1 ist, können wir sagen, dass das Objekt
 * schwimmt.
 *
 * Ihr ein Beispiel:
 *
 * Please enter sphere radius (in cm): 15 Please enter surface thickness (in
 * cm): 8 Total volume: 14130.0 cm3 Enter material density (in g/cm3): 2.6 Total
 * density: 2.335762962962963 => The object doesn't float
 */