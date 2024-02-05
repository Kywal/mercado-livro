package com.mercadolivro.repository

import com.mercadolivro.model.CostumerModel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface CostumerRepository : JpaRepository<CostumerModel, Int> {

    fun findByName(name: String): Optional<CostumerModel>
    override fun findById(id: Int): Optional<CostumerModel>
    fun findByEmail(email: String): Optional<CostumerModel>

}