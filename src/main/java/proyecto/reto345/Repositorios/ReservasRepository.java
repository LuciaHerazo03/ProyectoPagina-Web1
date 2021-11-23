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
import proyecto.reto345.Categorias.Reservas;
import proyecto.reto345.Interfacesdao.ReservasInterface;

/**
 *
 * @author Usuario
 */
@Repository
public class ReservasRepository {
    @Autowired
    private ReservasInterface crud4;
    
    public List<Reservas> getAll(){ 
        return (List<Reservas>)crud4.findAll();
    }
    
    public Optional<Reservas> getReservation (int id){
        return crud4.findById(id);
    }
    
    public Reservas save(Reservas reservation){
        return crud4.save(reservation);       
    }
    
    public void delete(Reservas reservation){
        crud4.delete(reservation);
    }
    
}
