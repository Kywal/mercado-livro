package com.mercadolivro.service

import com.mercadolivro.enums.Errors
import com.mercadolivro.exceptions.NotFoundException
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
        return repository.findByName(name)
            ?: throw NotFoundException(Errors.ML201.message.format(name),Errors.ML201.code)
    }

    fun findById(id: Int): CostumerModel {
        return repository.findByCostumerId(id)
            ?: throw NotFoundException(Errors.ML202.message.format(id),Errors.ML202.code)
    }

    fun findByEmail(email: String): CostumerModel {
        return repository.findByEmail(email)
            ?: throw NotFoundException(Errors.ML203.message.format(email),Errors.ML203.code)
    }
}