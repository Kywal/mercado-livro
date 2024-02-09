package com.mercadolivro.repository

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookModel, Int> {

    fun findByName(name: String): List<BookModel>
    fun findByStatus(status: BookStatus): List<BookModel>

//    @Query("SELECT '*' FROM costumer WHERE id = :id")
//    fun findByCostumerId(@Param("id") id: Int): List<BookModel>

}