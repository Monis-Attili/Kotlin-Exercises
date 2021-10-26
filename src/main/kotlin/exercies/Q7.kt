
import extensions.round
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val number:Double = 10.3479346
    number.round(4).also {
        ObservableMessage.message = "Number after rounded is $it"
    }
}


