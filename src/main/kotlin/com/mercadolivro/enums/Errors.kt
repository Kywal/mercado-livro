package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {

//  [101,200] -> Book related errors

    ML101("ML-101", "Book with name [%s] not exists"),
    ML102("ML-102", "Book with status [%s] not exists"),
    ML103("ML-102", "Cannot update book with status [%s]"),

//  [201,300] -> Customer related errors
    ML201("ML-201", "Customer with name [%s] not exists"),
    ML202("ML-202", "Customer with id: [%s] not exists"),
    ML203("ML-203","Customer with email [%s] not exists")
}