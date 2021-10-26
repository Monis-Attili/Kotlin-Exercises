import extensions.*
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

   sequenceOf(10 , 3 , -7 , 10 , -80 , 100 , 2)
       .filter { it > 0 }
       .sum()
       .also {
           ObservableMessage.message = "Sum of numbers is $it"
       }



}


