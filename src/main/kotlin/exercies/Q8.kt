
import extensions.isEven
import extensions.round
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val number = 12
    number.isEven().also {
        ObservableMessage.message = if (it) "Number is even" else "Number is odd"
    }

}


