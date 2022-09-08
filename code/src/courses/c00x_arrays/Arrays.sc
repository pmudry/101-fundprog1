val arr = Array.ofDim[Int](2, 3)

arr(0)(0) = 1
arr(0)(1) = 12
arr(0)(2) = 4

arr(1)(0) = 5
arr(1)(1) = 1
arr(1)(2) = 6

arr.indices
arr(0).indices

for (i <- 0 until arr.length) {
  for (j <- 0 until arr(i).length) {
    print(s"${arr(i)(j)} ")
  }
  println("")
}

for(i <- arr.indices){
  for(j <- arr(i).indices){
    print(s"${arr(i)(j)} ")
  }
  println("")
}


