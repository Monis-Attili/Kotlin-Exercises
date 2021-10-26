import extensions.*
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val number = -1
    number.isPositive().also {
        ObservableMessage.message = if (it) "Number is positive" else "Number is negative"
    }

}


