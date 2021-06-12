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
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
      FlowController.getInstance().InitializeFlow(stage, null);
      stage.setTitle("DEFENDER");
      FlowController.getInstance().goViewInWindow("LoginView");//para mostrar por medio de un flowcontroller una vista en una ventana nueva
      /*AudioClip audio = new AudioClip("cr/ac/una/defender/resources/MusicaFondoDefender.mp3");
      audio.play();
      audio.setVolume(0.85);*/
      
      /*File file = new File("cr/ac/una/defender/resources/MusicaFondoDefender.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        clip.start(); 
      (new Thread(){
          public void run(){
          com.sun.javafx.application.PlatformImpl.startup(()->{});
      
          final String musicaFondo = "MusicaFondoDefender.wav";
          File file = new File(musicaFondo);
          Media media = new Media(file.toURI().toString());
          MediaPlayer player = new MediaPlayer(media);
          player.play(); 
          }
      }).start();*/
    }

    public static void main(String[] args) {
        launch();
    }

}