/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.clases;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

/**
 *
 * @author Haymara
 */
public class Juego extends Pane {
    private int puntuacion = 0;
    private BorderPane bp = new BorderPane();
    private HBox hb = new HBox();;
    public GridPane gp = new GridPane();
    
    public Ballesta ballestas[];
    
    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;
    
    Label pts;
    
    public Juego(){}
    public Juego(Label pts){
    this.pts=pts;
        
  
    }

}
