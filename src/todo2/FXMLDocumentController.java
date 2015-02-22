/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author ajax-32
 */
public class FXMLDocumentController implements Initializable {
    
    //@FXML
    //private Label label;
    @FXML
    private TextField txtUser;
    @FXML
    private Label errorLabel;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Resconn res = new Resconn("Select * from users where username =" + "'" + txtUser.getText() + "'");
        String tes = res.getUsername();
        if(tes != null){
            this.stager(event);
        } else {
            errorLabel.setText("No Existe ese usuario");
        }
        
        
    }
    
    private void stager(ActionEvent event) throws IOException{
        // referimos a la pantalla principal con el nombre del formulario que necesitaremos
        Parent  home_page_parent = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
        // Necesitamos instanciar la nueva esena
        Scene home_page_scene = new Scene(home_page_parent);
        // Tenemos que saber que es un Stage
        Stage app_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        // Parece que la Scene sera el parent que referimos
        app_stage.hide();
        app_stage.setScene(home_page_scene);
        // Mostramos el stage % Llamemoslo estado %
        app_stage.show();    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
