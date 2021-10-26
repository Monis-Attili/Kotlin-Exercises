import extensions.*
import utils.ObservableMessage
import java.lang.Math
import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.max
import kotlin.math.roundToInt

fun main(args: Array<String>) {

    executeTask {
        doSomething()
    }
}


inline fun executeTask(crossinline execute:() -> Unit){
    execute()
}

 fun doSomething(){
    ObservableMessage.message = "I'm doing something"
     return
}


