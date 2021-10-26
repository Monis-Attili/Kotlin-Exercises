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

    val intList1= listOf(1,2,3,4,5)
    val intList2 = listOf(6,7,8)
    intList1.plus(intList2).forEach { println(it) }

    val stringList1 = mutableListOf("Ahmed" , "Monis")
    val stringList2 = mutableListOf("Sami" , "Rami")
    stringList1.union(stringList2).forEach {
        println(it)
    }


}




