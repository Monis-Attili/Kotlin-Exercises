import extensions.isEven
import extensions.quotientAndReminder
import extensions.round
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val maxNumber = sequenceOf(120, 23, 56, 67, 8, 4, 37, 44, 89)
        .maxOrNull() ?: 0
    maxNumber.also {
        ObservableMessage.message = "Max number in the list is $it"
    }



}


