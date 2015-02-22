/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo2;

import connect.connectDB.Resconn;
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
import javafx.scene.control.PasswordField;
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
    private PasswordField txtPass; 
    @FXML 
    private Label errorLabel;
    
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Resconn res = new Resconn("Select * from users where username =" + "'" + txtUser.getText() + "' AND password =" + "'"+ txtPass.getText() + "'");
        String username = res.getUsername();
        String password = res.getPassword();
        if(username != null && password != null){
            if (txtUser.getText() != username) {
                errorLabel.setText("El usuario no existe");
            }
            if(txtPass.getText() != password){
                errorLabel.setText("El Password es incorrecto");
            }
            
             this.stager(event);
            
        } else {
            errorLabel.setText("Error en la base de datos");
        }
        
        
    }
    
    private void stager(ActionEvent event) throws IOException{
        // referimos a la pantalla principal con el nombre del formulario que necesitaremos
        Parent  home_page_parent = FXMLLoader.load(getClass().getResource("FXMLHomePage.fxml"));
        // Necesitamos instanciar la nueva esena
        Scene home_page_scene = new Scene(home_page_parent);
        // Llamamos a la platilla de css
        String css = ToDo2.class.getResource("newStyles.css").toExternalForm();
        // Aplicamos la plantilla de css
        home_page_scene.getStylesheets().add(css);
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
