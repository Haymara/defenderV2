/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import cr.ac.una.defender.model.JugadorDto;
import cr.ac.una.defender.model.PartidaDto;
import cr.ac.una.defender.util.FlowController;
import cr.ac.una.defender.util.Formato;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Haymara
 */
public class GameViewController extends Controller implements Initializable {

    @FXML
    private JFXButton btnPausa;
    @FXML
    private Label lblPuntaje;
    @FXML
    private Label lblNivel;
    @FXML
    private ImageView imvProgreso;
    @FXML
    private ProgressBar pgbSaludCastillo;
    @FXML
    private ProgressBar pgbElixir;
    @FXML
    private JFXButton btnHechizoFuego;
    @FXML
    private JFXButton btnHechizoHielo;
    
    private PartidaDto partidaDto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        /*lblPuntaje.setTextFormatter(Formato.getInstance().integerFormat());*/
        nuevaPartida();
    } 
    
    public void bindPartida(Boolean nuevo){
        lblPuntaje.textProperty().bindBidirectional(partidaDto.puntaje);
        lblNivel.textProperty().bindBidirectional(partidaDto.nivel);
    }
    
    public void unbindPartida(){
        lblPuntaje.textProperty().unbindBidirectional(partidaDto.puntaje);
        lblNivel.textProperty().unbindBidirectional(partidaDto.nivel);
    }
    
    private void nuevaPartida(){
    unbindPartida();
    partidaDto = new PartidaDto();
    bindPartida(true);
    }

    @Override
    public void initialize() {
    }

    @FXML
    private void onActionBtnPausa(ActionEvent event) {
        FlowController.getInstance().goViewInWindowModal("MenuGame", this.getStage(), Boolean.TRUE);
    }

    @FXML
    private void onActionHechizoFuego(ActionEvent event) {
    }

    @FXML
    private void onActionHechizoHielo(ActionEvent event) {
    }
    
}