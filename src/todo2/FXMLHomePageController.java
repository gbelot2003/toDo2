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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ajax-32
 */
public class FXMLHomePageController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    public void backOn(ActionEvent event) throws IOException{
        
        Parent Document_page_parent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene Document_page_scene = new Scene(Document_page_parent);
        Stage app_stage2 = (Stage) ((Node) event.getSource()).getScene().getWindow();
        app_stage2.setScene(Document_page_scene);
        app_stage2.show();
                      
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO       
    }    
    
}
