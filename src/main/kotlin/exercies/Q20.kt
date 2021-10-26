import extensions.*
import models.Complex
import models.ComplexUtil
import models.Data
import models.EntryTagFilter
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    var capitals = hashMapOf<String, String>()
    capitals.put("Nepal", "Kathmandu")
    capitals.put("India", "New Delhi")
    capitals.put("United States", "Washington")
    capitals.put("England", "London")
    capitals.put("Australia", "Canberra")

    capitals.toSortedMap().forEach{
        println("[${it.key}] - ${it.value}")
    }

    /*capitals.toList().sortedBy { (keys,values) -> values }.toMap()
        .forEach{
            println("[${it.key}] - ${it.value}")
        }
*/





}





