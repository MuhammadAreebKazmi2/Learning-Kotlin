fun main () {

  val score = 80
  val isPlaying = true

  // AND Operator
  if (score == 80 && isPlaying) {
    println("Next Level")
  } else {
    println("Try again!")
  }

  // OR operator --> ||
  val num1 = 2
  val num2 = 3

  // a way to assign data to variables
  val text1 = if (num1 > 0 || num2 > num1) {
    "True condition"
  } else {
    99    // data can be different datatype since unassigned/undeclared
  }

  println("$text1")



}