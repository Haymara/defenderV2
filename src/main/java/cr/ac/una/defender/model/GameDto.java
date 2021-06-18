/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author duwan
 */
public class GameDto {
    
    public SimpleStringProperty puntaje;
    //public SimpleStringProperty nivelGame;
    public Long duracion;
    public ObjectProperty<Long> saludCastillo;
    public ObjectProperty<Long> elixir;
    public Long kills;
    public Long ballestaAd;
    public Long ballestaCd; 
    /*public ObjectProperty<LocalDate> dateinit;
    public ObjectProperty<LocalDate> dateLast;*/
    private Boolean modificado;

    public GameDto() {
        modificado = false;
        this.puntaje = new SimpleStringProperty();
        //this.nivelGame = new SimpleStringProperty();
        this.saludCastillo = new SimpleObjectProperty();
        this.elixir = new SimpleObjectProperty();
    }
    
    public GameDto(Game game){
        this();
        this.puntaje.set(game.getPuntaje().toString());
        this.elixir.set(game.getElixir());
        this.saludCastillo.set(game.getSaludcastillo());
        //this.nivelGame.set(game.getNivelGame().toString());
    }

    public Long getPuntaje() {
        if(puntaje.get()!=null && !puntaje.get().isEmpty())
            return Long.valueOf(puntaje.get());
        return null;
    } 

    public void setPuntaje(Long puntaje) {
        this.puntaje.setValue(puntaje.toString());
    }
    
    /*public Long getNivelGame() {
        if(nivelGame.get()!=null && !nivelGame.get().isEmpty())
            return Long.valueOf(nivelGame.get());
        return null;
    }

    public void setNivelGame(Long nivel) {
        this.nivelGame.setValue(nivel.toString());
    }*/

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }

    public Long getSaludCastillo() {
        return saludCastillo.get();
    }

    public void setSaludCastillo(Long saludCastillo) {
        this.saludCastillo.setValue(saludCastillo);
    }

    public Long getElixir() {
        return elixir.get();
    }

    public void setElixir(Long elixir) {
        this.elixir.setValue(elixir);
    }

    public Long getKills() {
        return kills;
    }

    public void setKills(Long kills) {
        this.kills = kills;
    }

    public Long getBallestaAd() {
        return ballestaAd;
    }

    public void setBallestaAd(Long ballestaAd) {
        this.ballestaAd = ballestaAd;
    }

    public Long getBallestaCd() {
        return ballestaCd;
    }

    public void setBallestaCd(Long ballestaCd) {
        this.ballestaCd = ballestaCd;
    }

   /* public LocalDate getDateinit() {
        return dateinit;
    }

    public void setDateinit(LocalDate dateinit) {
        this.dateinit = dateinit;
    }

    public LocalDate getDateLast() {
        return dateLast;
    }

    public void setDateLast(LocalDate dateLast) {
        this.dateLast = dateLast;
    }*/

    public Boolean getModificado() {
        return modificado;
    }

    public void setModificado(Boolean modificado) {
        this.modificado = modificado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PartidaDto{puntaje=").append(puntaje);
        //sb.append(", nivelGame=").append(nivelGame);
        sb.append(", duracion=").append(duracion);
        sb.append(", saludCastillo=").append(saludCastillo);
        sb.append(", elixir=").append(elixir);
        sb.append(", kills=").append(kills);
        sb.append(", ballestaAd=").append(ballestaAd);
        sb.append(", ballestaCd=").append(ballestaCd);
        sb.append(", modificado=").append(modificado);
        sb.append('}');
        return sb.toString();
    }    
}
