package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class MenuAplikasiC {

  @FXML
  private Stage stage;

  @FXML
  private Parent root;

  @FXML
  private Scene scene;
  @FXML
  private Label labelMenu;

  @FXML
  private Button Btn;

  @FXML
  private Button BtnDashboard;

  @FXML
  private Button btnBack;

  public void switchToMendaftar2(ActionEvent event) throws IOException {

    root = FXMLLoader.load(getClass().getResource("/fxml/Mendaftar2.fxml"));

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

  }
}
