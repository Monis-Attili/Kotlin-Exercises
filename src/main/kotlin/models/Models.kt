package models

data class EntryTag(
    val id: Long,
    val name: String,
    val color: String,
    val status: String
)

data class EntryTagSelectable(
    val content: EntryTag,
    val isSelected: Boolean,
    val title: String
)
