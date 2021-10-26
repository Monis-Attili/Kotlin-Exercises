import extensions.*
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    val message = "Lorem Ipsum is simply dummy texT of the printing 112"
    val messageList = message.split("\\s+".toRegex()) // or split(" ")
        .joinToString { "[$it]" }
        .forEach {
            print(it)
        }


   /* val messageCharacters = message.toCharArray()
        .forEach {
            print(it)
        }*/




}


