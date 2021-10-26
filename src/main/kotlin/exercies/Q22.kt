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

    val number = "2343.0r"
    try {
        number.isNumeric().also {
            ObservableMessage.message = if (it) "String is Numeric" else "String isn't Numeric"
        }
    }catch (e:Exception){
        ObservableMessage.message = "String isn't Numeric"
    }


}




