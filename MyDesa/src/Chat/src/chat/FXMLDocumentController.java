/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package chat;

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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
/**
 *
 * @author Xeesh
 */
public class FXMLDocumentController implements Initializable {
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @FXML 
    private TextArea pesan;
    
    @FXML
    private TextField chatmasuk;
    
    @FXML
    private Text Nama;
    
    @FXML
    private Label Nama1;
    
    public void pindah1(ActionEvent event) throws IOException{
       
       Parent root = FXMLLoader.load(getClass().getResource("ChatMes1.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
       
    }
    
    public void pindah2(ActionEvent event) throws IOException{
       
       Parent root = FXMLLoader.load(getClass().getResource("switch2.fxml"));
       stage = (Stage)((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();
       
    }
    
    public void sendButtonAction() throws IOException {
        String abu = pesan.getText();
        chatmasuk.setText(pesan.getText());
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
}
