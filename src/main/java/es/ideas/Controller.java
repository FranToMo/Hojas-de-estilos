package es.ideas;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import java.net.URL;
import java.util.ResourceBundle;



public class Controller implements Initializable {
    @FXML
    private AnchorPane panel;

    @FXML
    private void primerEstilo(ActionEvent event) {

        panel.getStylesheets().clear();
        panel.getStylesheets().add(String.valueOf(getClass().getResource("css/style01.css")));

    }
    @FXML
    private void segundoEstilo(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add(String.valueOf(getClass().getResource("css/style02.css")));
    }
    @FXML
    private void tercerEstilo(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add(String.valueOf(getClass().getResource("css/style03.css")));
    }
    @FXML
    private void resetear(ActionEvent event) {
        panel.getStylesheets().clear();
        panel.getStylesheets().add(String.valueOf(getClass().getResource("css/base.css")));
    }
    @FXML
    private void salir(ActionEvent event) {

        System.exit(0);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}