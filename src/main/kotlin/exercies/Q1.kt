import utils.ObservableMessage

fun main(args: Array<String>) {

    try {
        // sum of integers numbers
        MathUtil.sum(10, 20){result ->
            println(result)
        }

    }catch (exception:Exception){
        ObservableMessage.message = exception.message.toString()

    }catch (exception:InvalidNumbersException){
        ObservableMessage.message = exception.message
    }

}



