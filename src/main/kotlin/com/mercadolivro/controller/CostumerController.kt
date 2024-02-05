package com.mercadolivro.controller

import com.mercadolivro.model.CostumerModel
import com.mercadolivro.service.CostumerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("costumers")
class CostumerController(
    val costumerService: CostumerService
) {

    @PostMapping
    fun create(@RequestBody costumer : CostumerModel): ResponseEntity<CostumerModel> {
        return ResponseEntity.ok().body(costumerService.create(costumer))
    }

    @PutMapping
    fun update(@RequestBody costumer : CostumerModel): ResponseEntity<CostumerModel> {
        return ResponseEntity.ok().body(costumerService.update(costumer))
    }

    @DeleteMapping
    fun delete(@RequestBody costumer : CostumerModel) : ResponseEntity<Unit> {
        return ResponseEntity.ok().body(costumerService.delete(costumer))
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<CostumerModel>> {
        return ResponseEntity.ok().body(costumerService.findAll())
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["name"])
    fun findByName(@RequestParam name: String): ResponseEntity <CostumerModel> {
        return ResponseEntity.ok().body(costumerService.findByName(name))
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["id"])
    fun findById(@RequestParam id: Int): ResponseEntity<CostumerModel> {
        return ResponseEntity.ok().body(costumerService.findById(id))
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["email"])
    fun findByEmail(@RequestParam email: String): ResponseEntity<CostumerModel> {
        return ResponseEntity.ok().body(costumerService.findByEmail(email))
    }

}