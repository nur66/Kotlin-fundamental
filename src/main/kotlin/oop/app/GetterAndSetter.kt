package oop.app

import oop.data.BigNote
import oop.data.Note

fun main(){
    val note = Note("Belajar Kotlin")

    // getter
    println(note.title)
    println()
    // setter
    note.title = ""

    println()
    // getter
    val bigNote = BigNote("Belajar Kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)
}