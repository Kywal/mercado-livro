package com.mercadolivro.model

import com.mercadolivro.enums.BookStatus
import javax.persistence.*

@Entity(name = "book")
class BookModel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column
    var name: String,

    @Column
    var price: Double,

    @ManyToOne
    @JoinColumn(name = "costumer_id")
    var costumer: CostumerModel? = null
) {

    @Column
    @Enumerated(EnumType.STRING)
    var status: BookStatus = BookStatus.ATIVO
        set(value) {
            if(field == BookStatus.DELETADO || field == BookStatus.CANCELADO) {
                throw Exception("Um livro ${field!!.name} não pode ser modificado!")
            }

            field = value
        }
}
