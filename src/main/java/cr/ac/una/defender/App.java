package cr.ac.una.defender;

import cr.ac.una.defender.util.FlowController;
import java.io.File;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
      FlowController.getInstance().InitializeFlow(stage, null);
      stage.setTitle("DEFENDER");
      FlowController.getInstance().goViewInWindow("LoginView");
        (new Thread(){
          public void run(){
          com.sun.javafx.application.PlatformImpl.startup(()->{});
      
          Media media = new Media(App.class.getResource("resources/MusicaFondoDefender.wav").toString());
          MediaPlayer player = new MediaPlayer(media);
          player.play(); 
          }
      }).start(); 
   }

    public static void main(String[] args) {
        launch();
    }
}
   