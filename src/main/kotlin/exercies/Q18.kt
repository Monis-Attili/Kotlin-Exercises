import extensions.*
import models.Data
import models.EntryTagFilter
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val list = listOf(10 , 20 , 44 , 3 , -1 , 3 , 4)
    val value = 11

    list.valueContains(value).also {
        ObservableMessage.message = if (it) "the value $value is found in the list" else "the value $value isn't found in the list"
    }



}




