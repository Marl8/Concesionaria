
package com.mycompany.desafio1.Logica;

import com.mycompany.desafio1.Persistencia.ControladoraPersistencia;
import java.util.ArrayList;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // Auto
    
    public void crearAuto(Auto auto) {
    
        controlPersis.crearAuto (auto);
    }
    
     public void eliminarAuto (int id) {
         
        controlPersis.eliminarAuto (id);
    
     }
     
     public void editarAuto (Auto auto) { 
       
       controlPersis.editarAuto (auto);     
       
    }
     
     
     public ArrayList <Auto> traerListaAuto () {
        
         return controlPersis.traerListaAuto();
         
     } 

    public Auto traerAuto(int id) {
       return controlPersis.traerAuto(id);
    }

    public void guardar(String marca, String modelo, String colo, String motor,
            String patente, String puertas) {
        
        Auto auto = new Auto();
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(colo);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setNumPuertas(puertas);
        
        controlPersis.guardar(auto);
    }

    public void ModificarAuto(Auto auto, String marca, String modelo, String motor, String color, String patente, String puertas) {
        
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setNumPuertas(puertas);
        
        controlPersis.ModificarAuto(auto);
    }
    
}
