import utils.ObservableMessage

fun main(args: Array<String>) {

    val message = "Lorem Ipsum is simply dummy text of the printing and typesetting industry"
    message.removeWhitespaces().also { ObservableMessage.message = it }
}


