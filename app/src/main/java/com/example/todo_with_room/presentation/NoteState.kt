package com.example.todo_with_room.presentation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.todo_with_room.data.Note

data class NoteState(

    val notes: List<Note> = emptyList(),
    val title: MutableState<String> = mutableStateOf(""),
    val description: MutableState<String> = mutableStateOf("")

)