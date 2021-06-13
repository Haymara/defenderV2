/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.clases;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;

/**
 *
 * @author Haymara
 */
public class Monstruo extends Sprite {

    Salud salud;

    double saludMax;

    public Monstruo(Pane layer, Image image, double x, double y, double r, double dx, double dy, double dr, double health, double damage) {

        super(layer, image, x, y, r, dx, dy, dr, health, damage);

       
        saludMax = 50;//vida de 50
        
        setHealth(saludMax);

    }

    @Override
    public void checkRemovability() {

        if( Double.compare( getY(), 768) > 0) {
            setRemovable(true);
        }

    }

    public void addToLayer() {

        super.addToLayer();
      
        salud = new Salud();

        this.layer.getChildren().add(this.salud);

    }

    public void removeFromLayer() {

        super.removeFromLayer();

        this.layer.getChildren().remove(this.salud);

    }

    /**
     * Health as a value from 0 to 1.
     * @return
     */
    public double getRelativeHealth() {
        return getHealth() / saludMax;
    }


    
}
