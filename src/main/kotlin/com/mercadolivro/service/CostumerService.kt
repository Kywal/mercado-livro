package com.mercadolivro.service

import com.mercadolivro.model.CostumerModel
import com.mercadolivro.repository.CostumerRepository
import org.springframework.stereotype.Service

@Service
class CostumerService(
    val repository : CostumerRepository
) {

    fun create(costumer : CostumerModel): CostumerModel {
        return repository.save(costumer)
    }

    fun update(costumer: CostumerModel): CostumerModel {
        return repository.save(costumer)
    }

    fun delete(costumer: CostumerModel) {
        return repository.delete(costumer)
    }

    fun findAll(): List<CostumerModel> {
        return repository.findAll().toList()
    }

    fun findByName(name: String): CostumerModel {
        return repository.findByName(name).orElseThrow()
    }

    fun findById(id: Int): CostumerModel {
        return repository.findById(id).orElseThrow()
    }

    fun findByEmail(email: String): CostumerModel {
        return repository.findByEmail(email).orElseThrow()
    }
}