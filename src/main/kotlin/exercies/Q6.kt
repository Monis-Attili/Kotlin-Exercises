import utils.ObservableMessage

fun main(args: Array<String>) {

    val message = "Lorem Ipsum is simply dummy texT of the printing 112"
    message.findFrequencyChar(
        'l',
        enableIgnoreCase = true,
        enableDigits = true
    ).also {
        ObservableMessage.message = "Frequency count of character is $it"
    }
}


