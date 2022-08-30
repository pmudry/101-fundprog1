package labs.ideas

var length = 30
var symbol = "▒"

def progress(value : Int) = {
  require(value >= 1)

  for(i <- 1 to value){
    print("[")
    print(symbol * i)
    print(" " * (length-i) + "]")
    Thread.sleep(200)
    print("\b" * (length + 2))
  }

}

@main
def main() = {
  progress(10)
}