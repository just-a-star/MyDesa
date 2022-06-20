package Controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MendaftarControl {

  @FXML
  private Stage stage;

  @FXML
  private Scene scene;

  @FXML
  private Parent root;

  public void switchToMendaftar1(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("MYDESA/MyDesa/src/fxml/Mendaftar2.fxml"));

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void switchToMendaftar2(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("MYDESA/MyDesa/src/fxml/Mendaftar2.fxml"));

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

}
