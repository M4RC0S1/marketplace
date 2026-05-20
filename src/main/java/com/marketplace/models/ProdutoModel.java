package com.marketplace.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_PRODUTOS")
@Data

public class ProdutoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

}
