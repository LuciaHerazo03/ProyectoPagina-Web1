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
import proyecto.reto345.Categorias.Mensaje;
import proyecto.reto345.Interfacesdao.MensajeInterface;

/**
 *
 * @author Ingrid Moncayo
 */
@Repository
public class MensajeRepository {
    @Autowired
    private MensajeInterface crud3;
    
    public List<Mensaje> getAll(){ 
        return (List<Mensaje>)crud3.findAll();
    }
    
    public Optional<Mensaje> getMessage (int id){
        return crud3.findById(id);
    }
    
    public Mensaje save(Mensaje message){
        return crud3.save(message);       
    }
    
    public void delete(Mensaje message){
        crud3.delete(message);
    }
    
}
