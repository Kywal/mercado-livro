package com.mercadolivro.repository

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : JpaRepository<BookModel, Int> {

    fun findByName(name: String): BookModel?
    fun findByStatus(status: BookStatus): BookModel?

//    @Query("SELECT '*' FROM costumer WHERE id = :id")
//    fun findByCostumerId(@Param("id") id: Int): BookModel

}