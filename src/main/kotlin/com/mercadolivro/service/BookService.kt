package com.mercadolivro.service

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import com.mercadolivro.model.CostumerModel
import com.mercadolivro.repository.BookRepository
import com.mercadolivro.repository.CostumerRepository
import org.springframework.stereotype.Service

@Service
class BookService(
    val bookRepository: BookRepository,
    val costumerRepository: CostumerRepository
) {

    fun findAll(): List<BookModel> {
        return bookRepository.findAll().toList()
    }

    fun create(book: BookModel): BookModel {
        return bookRepository.save(book)
    }

    fun update(book: BookModel): BookModel {
        return bookRepository.save(book)
    }

    fun delete(book: BookModel) {
        bookRepository.delete(book)
    }

    fun findByName(name: String): List<BookModel> {
        return bookRepository.findByName(name)
    }

    fun findByUsername(name: String): List<BookModel> {
        val user: CostumerModel = costumerRepository.findByName(name).orElseThrow()

        return bookRepository.findByCostumerId(user.id!!)
    }

    fun findByStatus(status: BookStatus): List<BookModel>? {
        return bookRepository.findByStatus(status)
    }

    fun findByCostumerID(costumerID: Int): List<BookModel> {
        return bookRepository.findByCostumerId((costumerID))
    }


}
