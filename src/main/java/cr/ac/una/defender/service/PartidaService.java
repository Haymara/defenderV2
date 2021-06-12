/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.service;

import cr.ac.una.defender.model.PartidaDto;
import cr.ac.una.defender.util.Respuesta;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class PartidaService {
    
    public Respuesta getPartida(String usuario) {
        try {      
            PartidaDto partida = new PartidaDto();
            return new Respuesta(true, "", "", "Partida", partida);
        } catch (Exception ex) {
            Logger.getLogger(PartidaService.class.getName()).log(Level.SEVERE, "Error obteniendo el usuario [" + usuario + "]", ex);
            return new Respuesta(false, "Error obteniendo el usuario.", "getUsuario " + ex.getMessage());
        }
    }
    
    public Respuesta getPartida(Long id) {
        try {
            
            PartidaDto partida = new PartidaDto();
           /* partida.setId(1L);
            partida.nombre.setValue("Carlos");
            partida.pApellido.setValue("Carranza");*/
            return new Respuesta(true, "", "", "Partida", partida);
        } catch (Exception ex) {
            Logger.getLogger(PartidaService.class.getName()).log(Level.SEVERE, "Error obteniendo el partida [" + id + "]", ex);
            return new Respuesta(false, "Error obteniendo el partida.", "getPartida " + ex.getMessage());
        }
    }
    
    public Respuesta getPartidas(String nombre) {
        try {
            List<PartidaDto> partidas = new ArrayList<>();
            return new Respuesta(true, "", "", "Partidas", partidas);
        } catch (Exception ex) {
            Logger.getLogger(PartidaService.class.getName()).log(Level.SEVERE, "Error obteniendo partidas.", ex);
            return new Respuesta(false, "Error obteniendo partidas.", "getPartidas " + ex.getMessage());
        }
    }
    
    public Respuesta guardarPartida(PartidaDto partida) {
        try {
            
            return new Respuesta(true, "", "", "Partida", new PartidaDto());
        } catch (Exception ex) {
            Logger.getLogger(PartidaService.class.getName()).log(Level.SEVERE, "Error guardando el partida.", ex);
            return new Respuesta(false, "Error guardando el partida.", "guardarPartida " + ex.getMessage());
        }
    }
    
    public Respuesta eliminarPartida(Long id) {
        try {
            
            return new Respuesta(true, "", "");
        } catch (Exception ex) {
            Logger.getLogger(PartidaService.class.getName()).log(Level.SEVERE, "Error eliminando el partida.", ex);
            return new Respuesta(false, "Error eliminando el partida.", "eliminarPartida " + ex.getMessage());
        }
    }
}
