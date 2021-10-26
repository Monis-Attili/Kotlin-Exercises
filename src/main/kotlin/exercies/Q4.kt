import utils.ObservableMessage

fun main(args: Array<String>) {

    try {
        MathUtil.swap(88, number2 = 11) {
            ObservableMessage.message = "Number1 = ${it.first} , Number2 = ${it.second}"
        }
    } catch (exception: Exception) {
        ObservableMessage.message = exception.message.toString()

    } catch (exception: InvalidNumbersException) {
        ObservableMessage.message = exception.message
    }
}


