package com.marketplace.services;

import com.marketplace.models.ClienteModel;
import com.marketplace.repositorys.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteModel> listarClientes(){
        return clienteRepository.findAll();
    }

    public ClienteModel salvarCliente(ClienteModel cliente){
        return clienteRepository.save(cliente);
    }
}
