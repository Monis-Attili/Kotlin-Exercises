package extensions

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*
import kotlin.math.pow


fun Double.round(decimal: Int): Double {
    val bigDecimal = BigDecimal(this).setScale(decimal, RoundingMode.HALF_EVEN)
    return bigDecimal.toDouble()
}

// if the result of function is true then the value is even otherwise odd
fun Int.isEven(): Boolean {
    return this % 2 == 0
}

fun Double.isEven(): Boolean {
    return this.toInt() % 2 == 0
}

fun Int.isPositive(): Boolean {
    return this > 0
}

fun Int.quotientAndReminder(divisor: Int): Pair<Int, Int> {
    val quotient = this / divisor
    val reminder = this % divisor
    return Pair(quotient, reminder)
}

fun Double.quotientAndReminder(divisor: Int): Pair<Double, Double> {
    val quotient = this / divisor.toDouble()
    val reminder = this % divisor.toDouble()
    return Pair(quotient, reminder)
}

fun Int.isLeapYear(): Boolean {
    return if (this % 4 == 0) {
        if (this % 100 == 0) {
            this % 400 == 0
        } else true
    } else false;
}

fun Int.factorial(): Int {
    var fact = 1
    if (this == 1)
        return fact

    for (n in 1..this) {
        fact *= n
    }

    return fact
}

fun String.isNumeric(): Boolean {
    if (this.isNullOrEmpty())
        return false
    val number = this.trim()

    return number.all { it in '0'..'9' } || (number.toDouble() is Double)

}

fun Int.toBinary(): Stack<Int>? {
    var number = this
    var remainder = 0
    var binaryStack = Stack<Int>()

    if (number == 0) {
        return null
    }

    while (number != 0) {
        remainder = number % 2
        binaryStack.push(remainder)
        number /= 2
    }

    return binaryStack
}


fun Long.toDecimal(): Int {
    var num = this
    var decimalNumber = 0
    var i = 0
    var remainder:Long = 0

    while (num.toInt() != 0) {
        remainder = num % 10
        num /= 10
        decimalNumber += (remainder * 2.0.pow(i.toDouble())).toInt()
        ++i
    }
    return decimalNumber
}


fun Int.fibonacci():List<Int>{
    var number = this
    var elements = mutableListOf<Int>()

    if(number == 0){
        return mutableListOf(1)
    }
    if (number == 1)
    {
        return mutableListOf(1)
    }

    var first = 0
    var second = 1
    var sum = 0

    for (index in 1..number){
        elements.add(first)
        sum = first + second
        first = second
        second = sum
    }

    return elements
}
