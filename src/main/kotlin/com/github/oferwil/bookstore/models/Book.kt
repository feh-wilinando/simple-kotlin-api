package com.github.oferwil.bookstore.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Book(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) val id: Long,
        val name: String,
        val description: String)
