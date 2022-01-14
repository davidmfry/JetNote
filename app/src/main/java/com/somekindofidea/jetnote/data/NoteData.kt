package com.somekindofidea.jetnote.data

import com.somekindofidea.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title = "Awesome Day", description = "I went on an awesome hike!"),
            Note(title = "Android Compose", description = "Working on Android Compose"),
            Note(title = "iOS Learning", description = "Learned about Swift UI"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!"),
            Note(title = "A Movie Day", description = "Watching Movies with the Fam!")
        )
    }
}
