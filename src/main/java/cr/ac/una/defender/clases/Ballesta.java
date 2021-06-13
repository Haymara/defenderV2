/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.clases;

import javafx.scene.layout.Pane;

/**
 *
 * @author Haymara
 */
public class Ballesta extends Pane{
     double targetRange = 700; // la distancia dentro de la ballesta puede bloquear al enemigo
     double targetAngle = 0;
     double actualtAngle = 0;
     private float posx;
     private float posy;
     private int tamx;
     private int tamy;
     public String URL=null;
    public Ballesta balles[];
    
    public static final String ballesta1 = "cr/ac/una/defender/resources/game/BallestaAzul.PNG";

    public float getPosx() {
        return posx;
    }

    public void setPosx(float posx) {
        this.posx = posx;
    }

    public float getPosy() {
        return posy;
    }

    public void setPosy(float posy) {
        this.posy = posy;
    }

    public int getTamx() {
        return tamx;
    }

    public void setTamx(int tamx) {
        this.tamx = tamx;
    }
    
     public int getTamy() {
        return tamy;
    }

    public void setTamy(int tamy) {
        this.tamy = tamy;
    }
   
    public String getBallestaUno() {
        return ballesta1;
    }
 
    public Ballesta( float posx, float posy, int tamx, int tamy) {
      
        this.posx = posx;
        this.posy = posy;
        this.tamx = tamx;
        this.tamy = tamy;
    }
    
}
