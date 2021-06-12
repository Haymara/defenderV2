/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.model;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author duwan
 */
public class JugadorDto {
    
    public SimpleStringProperty nombreUsuario;
    public String ballesta;
    public Long nivel;
    
    
    
     public JugadorDto() {
         this.nombreUsuario = new SimpleStringProperty();
    }
     
   /* public JugadorDto(Jugador jugador){
        this.nombreUsuario.set(jugador.getNombre());
        
    }*/

    public String getNombreUsuario() {
        return nombreUsuario.get();
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario.set(nombreUsuario);
    }
    
        public String getBallesta() {
        return ballesta;
    }

    public void setBallesta(String ballesta) {
        this.ballesta = ballesta;
    }

    public Long getNivel() {
        return nivel;
    }

    public void setNivel(long nivel) {
        this.nivel = nivel;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JugadorDto{nombreUsuario=").append(nombreUsuario);
        sb.append(", ballesta=").append(ballesta);
        sb.append(", nivel=").append(nivel);
        sb.append('}');
        return sb.toString();
    }
}
