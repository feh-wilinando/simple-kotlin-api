package com.github.oferwil.bookstore.repositories

import com.github.oferwil.bookstore.models.Book
import org.springframework.stereotype.Repository

@Repository
class BooksRepository {

    companion object {
        private lateinit var books: Array<Book>
    }

    init {
        books = arrayOf(Book(id=1L, name = "JPA", description = "Some book of jpa"))
    }

    fun findAll(): Array<Book> {
        return books
    }

}
