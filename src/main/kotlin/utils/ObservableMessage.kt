package utils

import kotlin.properties.Delegates

object ObservableMessage {
    private const val INIT_MSG = ""

    var message:Any by Delegates.observable(INIT_MSG){ _, oldMsg, newMsg ->
        println(newMsg)
    }
}