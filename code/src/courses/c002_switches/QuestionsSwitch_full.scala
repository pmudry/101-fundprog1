package courses.c002_switches

import utils.Input

object QuestionsSwitch_full {
  def main(args: Array[String]) = {
    System.out.println("The Java lecture is : ")
    System.out.println("\t1 - Boring")
    System.out.println("\t2 - I've never been there")
    System.out.println("\t3 - Ok")
    System.out.println("\t4 - Do we have a Java class?")
    System.out.println("What is your choice< ? ")
    val value = Input.readInt
    value match {
      case 1 =>
        System.out.println("Sorry ! Will try to do better")
      case 2 =>
        System.out.println("No? You should give a try")
      case 3 =>
        System.out.println("I hope you like it")
      case 4 =>
        System.out.println("Indeed we do !")
      case _ =>
        System.out.println("Wrong input!")
    }
  }
}