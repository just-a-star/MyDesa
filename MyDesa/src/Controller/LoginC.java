package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import model.Admin;

public class LoginC {

  @FXML
  private Stage stage;

  @FXML
  private Scene scene;

  @FXML
  private Parent root;

  @FXML
  private TextField tfUsername;

  @FXML
  private TextField tfPassword;

  @FXML
  private TextField txtNama;

  @FXML
  private Button btnNext;

  Admin admin = new Admin();

  public void login(ActionEvent event) throws IOException {

    if (tfUsername.getText().equals(admin.getUserName()) && tfPassword.getText().equals(admin.getPassword())) {

      Alert alert = new Alert(AlertType.WARNING);
      alert.setTitle("Selamat datang!");
      alert.setHeaderText("Anda berhasil login");
      alert.setContentText("Selamat datang " + admin.getNama());
      alert.showAndWait();

      root = FXMLLoader.load(getClass().getResource("/fxml/MenuAplikasi.fxml"));

      stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();

      tfUsername.setText("");
      tfPassword.setText("");
    } else {
      Alert alert = new Alert(AlertType.ERROR);
      alert.setTitle("Error");
      alert.setHeaderText("Login Gagal");
      alert.setContentText("Username atau Password Salah");
      alert.showAndWait();
    }

  }

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

  // @Override
  // public void initialize(URL url, ResourceBundle rb) {
  // // TODO
  // }

}
