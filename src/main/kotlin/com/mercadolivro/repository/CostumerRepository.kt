package com.mercadolivro.repository

import com.mercadolivro.model.CostumerModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository

@Repository
interface CostumerRepository : JpaRepository<CostumerModel, Int> {

    fun findByName(name: String): CostumerModel?

    @Query("SELECT '*' FROM costumer WHERE id = :id")
    fun findByCostumerId(@Param("id") id: Int): CostumerModel?

    fun findByEmail(email: String): CostumerModel?

}