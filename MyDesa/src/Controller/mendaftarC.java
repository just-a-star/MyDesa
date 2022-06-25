package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class mendaftarC {

  @FXML
  private Stage stage;

  @FXML
  private Scene scene;

  @FXML
  private Parent root;

  @FXML
  private TextField txtNama;

  @FXML
  private Button btnNext;

  public void switchToMendaftar1(ActionEvent event) throws IOException {

    root = FXMLLoader.load(getClass().getResource("/fxml/MenuAplikasi.fxml"));

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

  }

  public void switchScene(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/src/fxml/Mendaftar2.fxml"));

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  public void switchToMendaftar2(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("/fxml/Mendaftar2.fxml"));

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

}
