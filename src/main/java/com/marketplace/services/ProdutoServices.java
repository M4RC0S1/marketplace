package com.marketplace.services;

import com.marketplace.models.ProdutoModel;
import com.marketplace.repositorys.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServices {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> listarProdutos(){
        return produtoRepository.findAll();
    }

    public ProdutoModel salvarProduto(ProdutoModel produto){
        return produtoRepository.save(produto);
    }
}
