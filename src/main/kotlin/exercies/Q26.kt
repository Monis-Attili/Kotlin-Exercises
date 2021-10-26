import extensions.*
import utils.ListStatus
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val list = listOf(
        10, 2, 4, 5, 2, 2, 1, 1, 30, 4, 6, 2, 7, 30, 55, 2, 40, 50,
        100, 200, 10000, 55, 67, 83, 28, 17, 67, 77, 77
    )

    list.removeDuplicates().also { println(it) }


}


