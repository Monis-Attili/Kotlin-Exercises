package extensions

import models.EntryTag
import models.EntryTagFilter
import utils.ListStatus
import utils.ObservableMessage
import java.security.MessageDigest
import java.util.*
import kotlin.collections.ArrayList

fun <T> List<T>.removeNull(): List<T> {
    if (this.isNullOrEmpty()) {
        return emptyList()
    }

    return mapNotNull { it }
}

fun List<Int>.removeOddAndNegative(): List<Int> {
    if (this.isNullOrEmpty()) {
        return emptyList()
    }
    return filter { (it > 0) && (it % 2 != 0) }
}

fun <T> List<T>.areEquals(otherList: List<T>): ListStatus {
    if (this.isEmpty() || otherList.isEmpty()) {
        return ListStatus.Error.EmptyList("please make sure that the lists is not empty")
    }

    if (this.size != otherList.size) {
        return ListStatus.Error.InvalidList("please make sure that the lists is matched in the size")
    }

    return if (this == otherList) ListStatus.Success(true) else ListStatus.Success(false)
}


fun List<EntryTag>.filterByName(entryTagFilter: EntryTagFilter = EntryTagFilter.NAME): List<EntryTag> {
    if (this.isNullOrEmpty()) {
        return emptyList()
    }

    return when (entryTagFilter) {
        EntryTagFilter.ID -> sortedBy { it.id }
        EntryTagFilter.NAME -> sortedBy { it.name }
        EntryTagFilter.COLOR -> sortedBy { it.color }
        EntryTagFilter.STATUS -> sortedBy { it.status }
    }
}


fun <T> List<T>.join(otherList: List<T>): List<T> {

    if (this.isEmpty() || otherList.isEmpty()) {
        return emptyList()
    }

    if (this.size != otherList.size) {
        return emptyList()
    }


    val list: MutableList<T> = ArrayList()
    list.addAll(this)
    list.addAll(otherList)
    return list
}




fun <T> List<T>.valueContains(value: T): Boolean {
    return this.contains(value)
}


fun <T> List<T>.hasDuplicates(): Boolean {
    return this.size != this.toSet().size
}

fun <T> List<T>.removeDuplicates(): List<T> {
    if (this.isNullOrEmpty()) {
        return emptyList()
    }

    if (hasDuplicates()) {
        return this.toSet().toList()
    }

    return this

}



