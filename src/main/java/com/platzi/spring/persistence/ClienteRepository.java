package com.platzi.spring.persistence;

import com.platzi.spring.persistence.crud.ClienteCrudRepository;
import com.platzi.spring.persistence.entity.Cliente;
import jdk.jfr.Registered;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository {

    private ClienteCrudRepository clienteCrudRepository;

    public Optional <Cliente> findById(String id){
        return  (Optional <Cliente>) clienteCrudRepository.findById(id);
    }
}
