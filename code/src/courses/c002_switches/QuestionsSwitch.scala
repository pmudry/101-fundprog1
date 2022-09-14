package courses.c002_switches

object QuestionsSwitch {
  def main(args: Array[String]) = {
    System.out.println("The Java lecture is : ")
    System.out.println("\t1 - Boring")
    System.out.println("\t2 - I've never been there")
    System.out.println("\t3 - Ok")
    System.out.println("\t4 - Do we have a Java class?")
    System.out.println("What is your choice ? ")
    val value = hevs.utils.Input.readInt
    if (value == 1) System.out.println("No it's not !")
    else if (value == 2) System.out.println("You should then give it a go")
    else if (value == 3) System.out.println("Danke!")
    else if (value == 4) System.out.println("Yes! Every Monday morning")
    else System.out.println("Not a valid input")
  }
}