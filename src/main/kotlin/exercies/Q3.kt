import extensions.quotientAndReminder
import utils.ObservableMessage

fun main(args: Array<String>) {

    val number = 15.0
    number.quotientAndReminder(4).also {
        ObservableMessage.message = "Quotient = ${it.first} , Reminder = ${it.second}"
    }
}

