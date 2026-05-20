package com.marketplace.controllers;

import com.marketplace.models.ClienteModel;
import com.marketplace.repositorys.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<ClienteModel> listarClientes(){
        return clienteRepository.findAll();
    }

    @PostMapping
    public ClienteModel adicionarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }
}
