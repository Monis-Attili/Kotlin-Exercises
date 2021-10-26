import extensions.isEven
import extensions.isLeapYear
import extensions.quotientAndReminder
import extensions.round
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val year = 2012
    year.isLeapYear().also {
        ObservableMessage.message = if (it) "$year is leap year" else "$year isn't leap year"
    }

}


