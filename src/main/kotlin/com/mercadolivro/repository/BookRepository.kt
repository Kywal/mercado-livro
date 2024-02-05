package com.mercadolivro.repository

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : CrudRepository<BookModel, Int> {

    fun findByName(name: String): List<BookModel>
    fun findByStatus(status: BookStatus): List<BookModel>

    @Query("SELECT '*' FROM costumer WHERE id = :id")
    fun findByCostumerId(@Param("id") id: Int): List<BookModel>

}