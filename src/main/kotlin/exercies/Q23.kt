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

    Data.entryTagsList.filterByName(EntryTagFilter.NAME).forEach {
        println(it)
    }

}




