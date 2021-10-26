import extensions.*
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    listOf(10 , 5 , 13 , 67 , -1 , -50 , 70 , 80 , 12 , 44 , -78)
        .removeOddAndNegative()
        .forEach {
            println(it)
        }


}


