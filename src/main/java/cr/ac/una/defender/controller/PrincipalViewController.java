/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.defender.util.FlowController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author duwan
 */
public class PrincipalViewController extends Controller implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private JFXButton btnMusica;
    @FXML
    private ImageView imvMusica;
    @FXML
    private JFXButton btnStart;
    @FXML
    private JFXButton btnEstadistica;
    @FXML
    private JFXButton btnInicio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onActionBtnStart(ActionEvent event) {
        getStage().close();
        
    }

    @FXML
    private void onActionBtnEstadistica(ActionEvent event) {
    }

    @Override
    public void initialize() {
    }

    @FXML
    private void onActionBtnInicio(ActionEvent event) {
        getStage().close();
    }
    
}
