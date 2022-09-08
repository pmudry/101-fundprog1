println("Hello World")

val tests = List("1", "12", "123", "1234", "12345", "123456", "1234567")

def sep(x: String, separator: Char = '\''): String = {
  def foo(s: List[Char]): List[Char] = {
    s match {
      case x :: y :: z :: rest if rest != Nil => x :: y :: z :: separator :: foo(rest)
      case _ => s
    }
  }

  foo(x.toList.reverse).mkString.reverse
}

def sep2(x: String, separator: Char = '\''): String =
  if (x.length > 3)
    sep2(x.take(x.length - 3)) + separator + x.takeRight(3)
  else
    x

// Ca marche mais c'est moche
def sep3(x: String, separator: Char = '\''): String =
  x.reverse.grouped(3).foldRight("")((res, elem) => res.mkString("") + separator + elem).reverse.tail

tests.foreach(x => println(sep(x)))
tests.foreach(x => println(sep2(x)))
tests.foreach(x => println(sep3(x)))




