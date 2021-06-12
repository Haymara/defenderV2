/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import cr.ac.una.defender.util.Formato;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Haymara
 */
public class RegistroController extends Controller implements Initializable {

    @FXML
    private JFXTextField txtUsuario;
    @FXML
    private JFXButton btnNuevo;
    @FXML
    private JFXButton btnSalir;
    @FXML
    private JFXButton btnAvatar;
    @FXML
    private JFXButton btnGuardar;
    @FXML
    private AnchorPane root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       txtUsuario.setTextFormatter(Formato.getInstance().letrasFormat(15));
    }    


    @FXML
    private void onActionBtnNuevo(ActionEvent event) {
          txtUsuario.clear();
    }

    @FXML
    private void onActionBtnSalir(ActionEvent event) {
          getStage().close();
    }

    @FXML
    private void onActionBtnGuardar(ActionEvent event) {
    }

    @Override
    public void initialize() {
    }

    @FXML
    private void onActionBtnAvatar(ActionEvent event) {
        FileChooser filechooser = new FileChooser();
        filechooser.setTitle("Explorador de archivos");
        Stage stage = (Stage)root.getScene().getWindow();
        filechooser.showOpenDialog(stage);
    }
    
}
