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
public class PartidaDto {
    
    public SimpleStringProperty puntaje;
    public SimpleStringProperty nivel;
    public Long duracion;
    public Long saludCastillo;
    public Long elixir;
    public Long kills;
    public Long ballestaAd;
    public Long ballestaCd; 
    /*public ObjectProperty<LocalDate> dateinit;
    public ObjectProperty<LocalDate> dateLast;*/
    private Boolean modificado;

    public PartidaDto() {
        modificado = false;
        this.puntaje = new SimpleStringProperty();
        this.nivel = new SimpleStringProperty();
        /*this.dateinit = new SimpleObjectProperty();
        this.dateLast = new SimpleObjectProperty();*/
        
    }

    public Long getPuntaje() {
        if(puntaje.get()!=null && !puntaje.get().isEmpty())
            return Long.valueOf(puntaje.get());
        return null;
    } 

    public void setPuntaje(Long puntaje) {
        this.puntaje.setValue(puntaje.toString());
    }
    
    public Long getNivel() {
        if(nivel.get()!=null && !nivel.get().isEmpty())
            return Long.valueOf(nivel.get());
        return null;
    }

    public void setNivel(Long nivel) {
        this.nivel.setValue(nivel.toString());
    }

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }

    public Long getSaludCastillo() {
        return saludCastillo;
    }

    public void setSaludCastillo(Long saludCastillo) {
        this.saludCastillo = saludCastillo;
    }

    public Long getElixir() {
        return elixir;
    }

    public void setElixir(Long elixir) {
        this.elixir = elixir;
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
        sb.append(", nivel=").append(nivel);
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
