package labs.ideas

object ProgressBar extends App {

  def progress(value: Int) = {
    require(value >= 1)

    var length : Int = value
    var symbol : String = "▒"

    for (i <- 1 to length) {
      print("[")
      print(symbol * i)
      print(" " * (length - i) + "]")
      Thread.sleep(250)
      print("\b" * (length + 2))
    }
  }

  progress(10)
}