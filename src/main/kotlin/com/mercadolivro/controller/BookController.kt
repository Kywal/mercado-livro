package com.mercadolivro.controller

import com.mercadolivro.enums.BookStatus
import com.mercadolivro.model.BookModel
import com.mercadolivro.service.BookService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("books")
class BookController(
    val bookService: BookService
) {

    @PostMapping
    fun create(@RequestBody book : BookModel): ResponseEntity<BookModel> {
        return ResponseEntity.ok(bookService.create(book))
    }

    @PutMapping
    fun update(@RequestBody book : BookModel): ResponseEntity<BookModel> {
        return ResponseEntity.ok(bookService.update(book))
    }

    @DeleteMapping
    fun delete(@RequestBody book : BookModel) : ResponseEntity<Unit> {
        return ResponseEntity.ok(bookService.delete(book))
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<BookModel>> {
        return ResponseEntity.ok(bookService.findAll())
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["bookname"])
    fun findByName(@RequestParam bookname: String): ResponseEntity <List<BookModel>> {
        return ResponseEntity.ok(bookService.findByName(bookname))
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["costumerID"])
    fun findByCostumerID(@RequestParam costumerID: Int): ResponseEntity <List<BookModel>> {
        return ResponseEntity.ok(bookService.findByCostumerID(costumerID))
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["username"])
    fun findByUsername(@RequestParam username: String): ResponseEntity <List<BookModel>> {
        return ResponseEntity.ok(bookService.findByUsername(username))
    }

    @RequestMapping(method = [RequestMethod.GET], params = ["status"])
    fun findByStatus(@RequestParam status: BookStatus): ResponseEntity <List<BookModel>> {
        return ResponseEntity.ok(bookService.findByStatus(status))
    }
}