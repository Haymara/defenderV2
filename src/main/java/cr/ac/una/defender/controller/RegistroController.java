/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.defender.controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import cr.ac.una.defender.util.Formato;
import cr.ac.una.defender.util.Mensaje;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.Window;

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
    @FXML
    private ImageView imvAvatar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       txtUsuario.setTextFormatter(Formato.getInstance().letrasFormat(15));
    }    


    @FXML
    private void onActionBtnNuevo(ActionEvent event) {
   if(new Mensaje().showConfirmation("Limpiar Registro", getStage(),"¿Estás seguro que desea limpiar el registro?" )){
    
        Image image = new Image("\\cr\\ac\\una\\defender\\resources\\UserIcon.png");
        imvAvatar.setImage(image);
            }
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
       // Stage stage = (Stage)root.getScene().getWindow();
        //filechooser.showOpenDialog(stage);
  

       Window stage1 = null;

        // Obtiene la imagen seleccionada  
       File imgFile = filechooser.showOpenDialog(stage1);

        // Muestra la imagen
        if (imgFile != null) {
            Image image = new Image("file:" + imgFile.getAbsolutePath());
            imvAvatar.setImage(image);
        }
    }
    
}
