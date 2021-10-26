package models

object Data {

    const val selectedEntryTagId = 43

    val vowelsList: List<Char> = listOf<Char>(
        'a', 'e', 'i', 'o', 'u'
    )

    val entryTagsList: MutableList<EntryTag> = mutableListOf<EntryTag>().apply {
        add(EntryTag(9, "Ahmad", "#0088dd", "ACTIVE"))
        add(EntryTag(5, "rami", "#005285", "ACTIVE"))
        add(EntryTag(2, "Sami", "#277ed5", "ACTIVE"))
        add(EntryTag(7, "Rami", "#ffffff", "ACTIVE"))
        add(EntryTag(21, "ah", "#409bdf", "ACTIVE"))
        add(EntryTag(43, "Al", "#55bcfc", "ACTIVE"))
        add(EntryTag(76, "Anas", "#0079c4", "ACTIVE"))
        add(EntryTag(214, "mais", "#0088dd", "ACTIVE"))
        add(EntryTag(214, "mais", "#5c6991", "ACTIVE"))
    }


    val inputList = mutableListOf<EntryTag>().apply {
        add(EntryTag(9, "Ahmad","#0088dd","ACTIVE"))
        add(EntryTag(5, "rami","#005285","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(2, "Sami","#277ed5","ACTIVE"))
        add(EntryTag(7, "Rami","#ffffff","ACTIVE"))
        add(EntryTag(21, "ah","#409bdf","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(43, "Al","#55bcfc","ACTIVE"))
        add(EntryTag(76, "Anas","#0079c4","ACTIVE"))
        add(EntryTag(214, "mais","#0088dd","ACTIVE"))
        add(EntryTag(214, "mais","#5c6991","ACTIVE"))
    }


}