// will be looking into byte, short and long data types

fun main() {
  var name: String = "Alex"
  // val age: Int = 22
  var age: Long = 22

  val maxIntegerValue: Int = Int.MAX_VALUE
  val minIntegerValue: Int = Int.MIN_VALUE

  println("Integer max value is: $maxIntegerValue")
  println("Integer min value is: $minIntegerValue")

  age = 2147483648

  val myMaxByteValue: Byte = Byte.MAX_VALUE
  val myMinByteValue: Byte = Byte.MIN_VALUE
  println("Byte maximum value is: $myMaxByteValue")
  println("Byte minimum value is: $myMinByteValue")

  val myMaxShortValue: Short = Short.MAX_VALUE
  println("Short max value is: $myMaxShortValue")

  val myMaxLongValue: Long = Long.MAX_VALUE
  println("Long max value is: $myMaxLongValue")
}
