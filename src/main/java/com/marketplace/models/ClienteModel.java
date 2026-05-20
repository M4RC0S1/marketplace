package com.marketplace.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "TBL_CLIENTES")
@Data

public class ClienteModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

}
