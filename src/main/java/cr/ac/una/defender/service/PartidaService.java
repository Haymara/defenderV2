package cr.ac.una.defender.service;

import cr.ac.una.defender.model.Game;
import cr.ac.una.defender.model.GameDto;
import cr.ac.una.defender.util.EntityManagerHelper;
import cr.ac.una.defender.util.Respuesta;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author Carlos
 */
public class PartidaService {
    
    EntityManager em = EntityManagerHelper.getInstance().getManager();
    private EntityTransaction et;
    
    public Respuesta getPartida(Long id) {
        try {
            TypedQuery<Game> query = em.createNamedQuery("Game.findByGamId", Game.class);
            query.setParameter("id", query);
            //JugadorDto jugador = new JugadorDto();

            return new Respuesta(true, "", "", "Partida", new GameDto(query.getSingleResult()));
        } catch (Exception ex) {
            Logger.getLogger(PartidaService.class.getName()).log(Level.SEVERE, "Error obteniendo el partida [" + id + "]", ex);
            return new Respuesta(false, "Error obteniendo el partida.", "getPartida " + ex.getMessage());
        }
    }
    
    public Respuesta getPartidas(String nombre) {
        try {
            List<GameDto> partidas = new ArrayList<>();
            return new Respuesta(true, "", "", "Partidas", partidas);
        } catch (Exception ex) {
            Logger.getLogger(PartidaService.class.getName()).log(Level.SEVERE, "Error obteniendo partidas.", ex);
            return new Respuesta(false, "Error obteniendo partidas.", "getPartidas " + ex.getMessage());
        }
    }
    
    public Respuesta guardarPartida(GameDto partida) {
        try {
            
            return new Respuesta(true, "", "", "Partida", new GameDto());
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
