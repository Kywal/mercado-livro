package com.mercadolivro.service

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.enums.Errors
import com.mercadolivro.exceptions.NotFoundException
import com.mercadolivro.model.BookModel
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

    fun findByName(name: String): BookModel {
        return bookRepository.findByName(name)
            ?: throw NotFoundException(Errors.ML101.message.format(name), Errors.ML101.code)
    }

    fun findByStatus(status: BookStatus): BookModel {
        return bookRepository.findByStatus(status)
            ?: throw NotFoundException(Errors.ML102.message.format(status), Errors.ML102.code)
    }

//    fun findByUsername(name: String): BookModel {
//        val user: CostumerModel = costumerRepository.findByName(name).orElseThrow()
//
//        return bookRepository.findByCostumerId(user.id!!)
//    }
//
//    fun findByCostumerID(costumerID: Int): BookModel {
//        return bookRepository.findByCostumerId((costumerID))
//    }


}
