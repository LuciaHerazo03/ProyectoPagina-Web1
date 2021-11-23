/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.reto345.Repositorios;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import proyecto.reto345.Categorias.Categoria;
import proyecto.reto345.Interfacesdao.CategoriaInterface;

/**
 *
 * @author Usuario
 */
@Repository
public class CategoriaRepository {
    @Autowired
    private CategoriaInterface crud;
     public List<Categoria> getAll(){ 
        return (List<Categoria>)crud.findAll();
    }
    
    public Optional<Categoria> getCategoria (int id){
        return crud.findById(id);
    }
    
    public Categoria save(Categoria Categoria){
        return crud.save(Categoria);       
    }
    
    public void delete(Categoria Categoria){
        crud.delete(Categoria);
    }
    
}