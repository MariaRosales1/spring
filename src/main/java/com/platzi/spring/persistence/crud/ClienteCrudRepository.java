package com.platzi.spring.persistence.crud;

import com.platzi.spring.persistence.entity.Cliente;
import com.platzi.spring.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

// en la interfaz CrudRepository pones la clase que representa una entidad en
// la base de datos y pones el tipo de dato de la clase primaria de esa entidad
public interface ClienteCrudRepository extends CrudRepository<Cliente,String> {


}
