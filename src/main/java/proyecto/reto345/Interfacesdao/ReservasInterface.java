/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.reto345.Interfacesdao;

import org.springframework.data.repository.CrudRepository;
import proyecto.reto345.Categorias.Reservas;

/**
 *
 * @author Usuario
 */
public interface ReservasInterface extends CrudRepository<Reservas,Integer>{
    
}
