/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.clases;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeType;

/**
 *
 * @author Haymara
 */
public class Salud extends Pane {

    public Salud(Rectangle outerHealthRect, Rectangle innerHealthRect) {
        this.outerHealthRect = outerHealthRect;
        this.innerHealthRect = innerHealthRect;
    }

    Rectangle outerHealthRect;
    Rectangle innerHealthRect;

    public Salud() {

        int height = 10;

        int outerWidth = 60;
        int innerWidth = 40;

        int x=0;
        int y=0;
        
        outerHealthRect = new Rectangle(x, y, 60, 60);
        outerHealthRect.setStroke(Color.BLACK);
        outerHealthRect.setStrokeWidth(2);
        outerHealthRect.setStrokeType( StrokeType.OUTSIDE);
        outerHealthRect.setFill(Color.RED);

        innerHealthRect = new Rectangle( x, y, innerWidth, height);
     
        
        getChildren().addAll(outerHealthRect,innerHealthRect);

    }

    public void setValue( double value) {
        innerHealthRect.setWidth(outerHealthRect.getWidth()*value);
    }

}
