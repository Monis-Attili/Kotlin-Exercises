import extensions.*
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    listOf("Ahmed", "Monis", "Rami", null, "Sami", "Zaid", null, "Noor", null, null)
        .removeNull()
        .forEach {
            println(it)
        }


}


