import extensions.*
import models.Data
import models.EntryTagSelectable
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    Data.inputList
        .asSequence()
        .filter { it.id == Data.selectedEntryTagId.toLong() }
        .map {
            EntryTagSelectable(content = it , isSelected = true , title = it.name)
        }
        .forEach {
            println("content = ${it.content} , isSelected = ${it.isSelected}")
        }

}




