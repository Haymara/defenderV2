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
    private JFXButton btnInicio;
    @FXML
    private JFXButton btnPuntaje;
    @FXML
    private JFXButton btnBallesta;
    @FXML
    private JFXButton btnHelp;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    private void onActionBtnStart(ActionEvent event) {
        getStage().close();
        
    }


    @Override
    public void initialize() {
    }

    @FXML
    private void onActionBtnInicio(ActionEvent event) {
        getStage().close();
        FlowController.getInstance().goViewInWindow("GameView");
    }

    @FXML
    private void onActionBtnPuntaje(ActionEvent event) {
    }

    @FXML
    private void onActionBtnBallesta(ActionEvent event) {
    }

    @FXML
    private void onActionBtnHelp(ActionEvent event) {
        getStage().close();
        FlowController.getInstance().goViewInWindow("HelpView");
    }
    
}
