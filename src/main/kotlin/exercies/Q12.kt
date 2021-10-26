import extensions.*
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val character: Char = 'A'
    character.isAlphabet().also {
        ObservableMessage.message = if (it) "Character is Alphabet" else "Character isn't alphabet"
    }

}


