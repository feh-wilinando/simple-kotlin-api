package com.github.oferwil.bookstore.controllers

import com.github.oferwil.bookstore.models.Book
import com.github.oferwil.bookstore.repositories.BooksRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("books")
class BooksController(private val repository: BooksRepository) {


    @GetMapping
    fun list(): Array<Book> {
        return repository.findAll()
    }
}