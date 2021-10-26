import java.lang.Math
import java.util.*

object MathUtil{

    inline fun sum(number1: Any?, number2: Any?, result: (Any?) -> Any?) {
        if (number1 == null || number2 == number1) {
            throw InvalidNumbersException("An error occurred ,numbers can not be empty")
        }
        if ((number1 is Int) && (number2 is Int)) {
            result((number1 + number2)) as Int
        } else if ((number1 is Double) && (number2 is Double)) {
            result((number1 + number2) as Double)
        } else if ((number1 is Float) && (number2 is Float)) {
            result((number1 + number2)) as Float
        } else if ((number1 is Long) && (number2 is Long)) {
            result((number1 + number2)) as Long
        } else {
            throw InvalidNumbersException("An error occurred ,types of numbers should be matched")
        }
    }

    inline fun Multiply(number1: Any?, number2: Any?, result: (Any?) -> Any?) {
        if (number1 == null || number2 == number1) {
            throw InvalidNumbersException("An error occurred ,numbers can not be empty")
        }
        if ((number1 is Int) && (number2 is Int)) {
            result((number1 * number2)) as Int
        } else if ((number1 is Double) && (number2 is Double)) {
            result((number1 * number2) as Double)
        } else if ((number1 is Float) && (number2 is Float)) {
            result((number1 * number2)) as Float
        } else if ((number1 is Long) && (number2 is Long)) {
            result((number1 * number2)) as Long
        } else {
            throw InvalidNumbersException("An error occurred ,types of numbers should be matched")
        }
    }


    inline fun <T : Number> swap(number1: T, number2: T, action: (Pair<T?, T?>) -> Unit) {
        if (number1 == null || number2 == number1) {
            throw InvalidNumbersException("An error occurred ,numbers can not be empty")
        }
        var first = number1
        var second = number2
        println("$first $second")

        val temp = first
        first = second
        second = temp

        action(Pair(first, second))
    }

    fun toDecimal(num: Long): Int {
        var number = num
        var decimalNumber = 0
        var i = 0
        var remainder: Long

        while (number.toInt() != 0) {
            remainder = num % 10
            number /= 10
            decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
            ++i
        }
        return decimalNumber
    }


    fun toBinary(num:Int): Stack<Int>? {
        var number = num
        var remainder = 0
        var binaryStack = Stack<Int>()

        if (number == 0) {
            return null
        }

        while (num != 0) {
            remainder = number % 2
            binaryStack.push(remainder)
            number /= 2
        }

        return binaryStack
    }


}

class InvalidNumbersException(override var message: String) : IllegalAccessException(message)