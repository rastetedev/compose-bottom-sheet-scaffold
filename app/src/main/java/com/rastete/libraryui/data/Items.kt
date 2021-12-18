package com.rastete.libraryui.data

import com.rastete.libraryui.R

val books = listOf(
    Book("Muscle", R.drawable.book_muscle, "Alan Trotter"),
    Book("Dominicana", R.drawable.book_dominicana, "Angie Cruz"),
    Book("A New Program for Graphic Design", R.drawable.book_a_new, "David Reinfurt"),
)

data class Book(
    val title: String,
    val image: Int,
    val author: String
)

val myBookItems = listOf(
    MyBook(Book("Just My Type", R.drawable.book_just_my_type, "Simon Garfield"), "25.03.2022", 75f),
    MyBook(books[0], "25.02.2022", 80f),
    MyBook(books[1], "21.01.2022", 90f),
)

data class MyBook(
    val book: Book,
    val returnDate: String,
    val timeLeftPercentage: Float
)