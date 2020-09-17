package eu.shalldev.player.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.FileChooser;

import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;


public class MediaPlayerController implements Initializable {

    private String filePath;
    private MediaPlayer mediaPlayer;

    @FXML
    private Label label;

    @FXML
    private MediaView mediaView;

    @FXML
    private void handleButtonAction(ActionEvent event) {

        FileChooser fileChooser = new FileChooser();
        FileChooser.ExtensionFilter filter = new FileChooser.ExtensionFilter("Mp4 file please", "*.mp4");

        fileChooser.getExtensionFilters().add(filter);

        File file = fileChooser.showOpenDialog(null);
        filePath = file.toURI().toString();

        if(filePath != null) {
            Media media = new Media(filePath);
            mediaPlayer = new MediaPlayer(media);
            mediaView.setMediaPlayer(mediaPlayer);
            mediaPlayer.play();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


}
