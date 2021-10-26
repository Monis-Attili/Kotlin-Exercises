import extensions.*
import models.Data
import models.EntryTagFilter
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*

fun main(args: Array<String>) {

    val decimal  = 12
    decimal.toBinary()?.let {
        print("Result of convert (decimal to binary) : ")
        it.reversed().forEach {
            print(it)
        }
    }

    println()

    val binary:Long = 111111
    binary.toDecimal().also {
        print("Result of convert (binary to decimal) : $it")
    }




}







