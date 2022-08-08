fun main() {
    val age: Short = 200
    println(age)

    // Floating point number
    val sample: Float = 10.10F
    println(sample)

    // Literals
    val decimalLiteral: Int = 100
    val hexadecimalLiteral: Int = 0xff
    val binaryLiteral: Int = 0b0101011
    println(decimalLiteral)
    println(hexadecimalLiteral)
    println(binaryLiteral)

    // Underscore in number
    val balance: Long = 100_000_000_000L
    println(balance)

    // Conversion
    val balanceInt: Int = balance.toInt()
    println(balanceInt)
    val doubleBinaryLiteral: Double = binaryLiteral.toDouble()
    println(doubleBinaryLiteral)
}