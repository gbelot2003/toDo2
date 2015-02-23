/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author ajax-32
 */
public class FXMLInsterTaskController implements Initializable {
    
    @FXML
    private MenuButton MenuButtonHour;
    
    @FXML 
    private MenuButton MenuButtonMinutes;
    
    @FXML
    private MenuButton MenuButtonAmp;
    
    @FXML
    private TextField TitleField;
    
    @FXML
    private TextField LocationField;
    
    @FXML
    private TextArea NotesArea;
    
    @FXML
    private DatePicker Date_Date;
    
    @FXML
    private Button DoneButton;
    
    
    @FXML
    private void hourMenuItemButtonAction(ActionEvent event){
        MenuItem menu = (MenuItem) event.getSource();
        MenuButtonHour.setText(menu.getText());
    }

    @FXML
    private void MinutMenuItemButtonAction(ActionEvent event){
        MenuItem menu = (MenuItem) event.getSource();
        MenuButtonMinutes.setText(menu.getText());
    }
    
    @FXML
    private void AmpMenuItemButtonAction(ActionEvent event){
        MenuItem menu = (MenuItem) event.getSource();
        MenuButtonAmp.setText(menu.getText());
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        // TODO
    }    
    
}
