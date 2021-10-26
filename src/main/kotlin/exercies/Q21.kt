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

    val originComplex = Complex(11 , 20)
    val otherComplex = Complex(5 , 2 )

    val finalComplex = ComplexUtil.add(originComplex,otherComplex)
    finalComplex?.let {
        ObservableMessage.message = "New complex object : $it"
    }







}





