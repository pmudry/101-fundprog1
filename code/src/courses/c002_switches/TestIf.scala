package courses.c002_switches

import labs.lab05_secretnumber.Input

object TestIf {
  def main(args: Array[String]) = {
    val a = 45
    var b = false
    if (a % 2 == 0) b = true
    else b = false
  }
}