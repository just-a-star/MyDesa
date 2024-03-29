package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Admin;

import java.io.IOException;

public class LoginC {

    Admin admin = new Admin();
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private TextField tfUsername;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private TextField txtNama;
    @FXML
    private Button btnNext;

    public void login(ActionEvent event) throws IOException {

        if (tfUsername.getText().equals(admin.getUserName()) && tfPassword.getText().equals(admin.getPassword())) {

            Alert alert = new Alert(AlertType.WARNING);
            alert.setTitle("Selamat datang!");
            alert.setHeaderText("Anda berhasil login");
            alert.setContentText("Selamat datang " + admin.getNama());
            alert.showAndWait();

            root = FXMLLoader.load(getClass().getResource("/view/MenuAplikasi.fxml"));

            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            String css = this.getClass().getResource("/css/MenuAplikasi.css").toExternalForm();
            scene.getStylesheets().add(css);

        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Login Gagal");
            alert.setContentText("Username atau Password Salah");
            alert.showAndWait();
        }
        // tfUsername.setText("");
        // tfPassword.setText("");

    }

    // @Override
    // public void initialize(URL url, ResourceBundle rb) {
    // // TODO
    // }

}
