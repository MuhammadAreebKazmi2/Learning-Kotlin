fun main () {
  val alarm = 12

  // works like a CASE WHEN / SWITCH Case 
  when (alarm) {
    12 -> println("The time is 12")
    11, 10, 9 -> println("Alarm is fine") // OR statements in commas.
    in 1 .. 4 -> println("Alarm in range") // in range
    7 -> println("The time is 7")
    else -> println("Bad time")
  }
}

// can put curly braces for multiple statements
