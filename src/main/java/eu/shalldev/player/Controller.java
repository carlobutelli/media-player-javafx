package eu.shalldev.player;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.media.MediaView;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Label label;

    @FXML
    private MediaView mediaView;

    @FXML
    private void handleButtonAction(ActionEvent actionEvent) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }


}
