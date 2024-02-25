package com.example.todo_with_room.presentation

import com.example.todo_with_room.data.Note

sealed interface NotesEvent {
    object SortNotes: NotesEvent

    data class DeleteNote(val note: Note) : NotesEvent

    data class SaveNote(val title: String, val description: String) : NotesEvent
}