import extensions.*
import utils.ListStatus
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val list1 = listOf(10, 2, 4, 5, 2)
    val list2 = listOf(10, 2, 4, 5, 2)

    list1.areEquals(list2).also {
        when (it) {
            is ListStatus.Success -> {
                ObservableMessage.message =
                    if (it.data) "Contents of lists is equals" else "Contents of lists isn't equals"
            }

            is ListStatus.Error.EmptyList -> {
                ObservableMessage.message = it.meesage
            }

            is ListStatus.Error.InvalidList -> {
                ObservableMessage.message = it.meesage
            }
        }
    }

}


