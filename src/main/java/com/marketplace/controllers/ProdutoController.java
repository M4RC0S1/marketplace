package com.marketplace.controllers;

import com.marketplace.models.ProdutoModel;
import com.marketplace.services.ProdutoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoServices produtoServices;

    @GetMapping
    public List<ProdutoModel> listarProdutos(){
        return produtoServices.listarProdutos();
    }

    @PostMapping
    public ProdutoModel adicionarProduto(ProdutoModel produto){
        return produtoServices.salvarProduto(produto);
    }
}
