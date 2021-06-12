/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.service;

import cr.ac.una.defender.model.JugadorDto;
import cr.ac.una.defender.util.Respuesta;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JugadorService {
    
    public Respuesta getUsuario(String usuario) {
        try {      
            JugadorDto jugador = new JugadorDto();
            return new Respuesta(true, "", "", "Jugador", jugador);
        } catch (Exception ex) {
            Logger.getLogger(JugadorService.class.getName()).log(Level.SEVERE, "Error obteniendo el usuario [" + usuario + "]", ex);
            return new Respuesta(false, "Error obteniendo el usuario.", "getUsuario " + ex.getMessage());
        }
    }
    
    public Respuesta getJugador(Long id) {
        try {
            
            JugadorDto jugador = new JugadorDto();
            /*jugador.setId(1L);
            jugador.nombre.setValue("Carlos");
            jugador.pApellido.setValue("Carranza");*/
            return new Respuesta(true, "", "", "Jugador", jugador);
        } catch (Exception ex) {
            Logger.getLogger(JugadorService.class.getName()).log(Level.SEVERE, "Error obteniendo el jugador [" + id + "]", ex);
            return new Respuesta(false, "Error obteniendo el jugador.", "getJugador " + ex.getMessage());
        }
    }
    
    public Respuesta getJugadores(String nombre) {
        try {
            List<JugadorDto> jugadores = new ArrayList<>();
            return new Respuesta(true, "", "", "Jugadors", jugadores);
        } catch (Exception ex) {
            Logger.getLogger(JugadorService.class.getName()).log(Level.SEVERE, "Error obteniendo jugadores.", ex);
            return new Respuesta(false, "Error obteniendo jugadores.", "getJugadores " + ex.getMessage());
        }
    }
    
    public Respuesta guardarJugador(JugadorDto jugador) {
        try {
            
            return new Respuesta(true, "", "", "Jugador", new JugadorDto());
        } catch (Exception ex) {
            Logger.getLogger(JugadorService.class.getName()).log(Level.SEVERE, "Error guardando el jugador.", ex);
            return new Respuesta(false, "Error guardando el jugador.", "guardarJugador " + ex.getMessage());
        }
    }
    
    public Respuesta eliminarJugador(Long id) {
        try {
            
            return new Respuesta(true, "", "");
        } catch (Exception ex) {
            Logger.getLogger(JugadorService.class.getName()).log(Level.SEVERE, "Error eliminando el jugador.", ex);
            return new Respuesta(false, "Error eliminando el jugador.", "eliminarJugador " + ex.getMessage());
        }
    }
}
