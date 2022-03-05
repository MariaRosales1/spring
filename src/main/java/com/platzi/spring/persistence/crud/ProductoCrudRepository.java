package com.platzi.spring.persistence.crud;

import com.platzi.spring.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {

    // podemos usar la anotacion @Query para poner la consulta y poner la bandera
    //nativeQuery en true. Si se usa esa notacion no es necesario seguir el estandar para
    // llamar los metodos, haciendo uso del queryMethodos

    @Query(value = "SELECT * FROM productos WHERE id_categoria = ?", nativeQuery = true)
    List<Producto> findByIdCategoria(int idCategory);

    //uso queryMethods
     List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    public Optional<List<Producto> >findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
