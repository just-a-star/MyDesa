package controller;

import java.io.IOException;

import javax.print.DocFlavor.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import main.MyDesa;
import util.OpenScene;

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
  private Button BtnHome;

  @FXML
  private Button BtnDashboard;

  @FXML
  private Button btnBack;

  @FXML
  private BorderPane homepagePane;

  public void switchToMendaftar2(ActionEvent event) throws IOException {

    root = FXMLLoader.load(getClass().getResource("/view/Mendaftar2.fxml"));

    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();

  }

  @FXML
  private void toHomepage(ActionEvent event) throws IOException {
    OpenScene object = new OpenScene();
    Pane halaman = object.getPane("Homepage");
    homepagePane.setCenter(halaman);
  }
}
