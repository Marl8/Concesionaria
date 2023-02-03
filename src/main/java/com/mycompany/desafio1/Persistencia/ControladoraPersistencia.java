
package com.mycompany.desafio1.Persistencia;

import com.mycompany.desafio1.Logica.Auto;
import com.mycompany.desafio1.Persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    AutoJpaController autoJpa = new AutoJpaController();
    
    
    
    public void guardar(Auto auto) {
       
        //Creamos en la Base de Datos el auto
        
        autoJpa.create(auto);
        
    }

    public void crearAuto(Auto auto) {
      autoJpa.create(auto);
    }

    public void eliminarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAuto(Auto auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Auto> traerListaAuto() {
        
          List <Auto> listAut = autoJpa.findAutoEntities();
          ArrayList <Auto> listAutos = new ArrayList <> (listAut);
          
          return  listAutos;
    }

    public Auto traerAuto(int id) {
       
        return autoJpa.findAuto(id);
    }

    public void ModificarAuto(Auto auto2) {
        try {
            autoJpa.edit(auto2);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
   
    
    
}
