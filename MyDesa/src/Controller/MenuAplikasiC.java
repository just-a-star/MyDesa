package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import util.OpenScene;

import java.io.IOException;

public class MenuAplikasiC {

    @FXML
    public BorderPane homepagePane;
    @FXML
    private Stage stage;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Label labelMenu;
    @FXML
    private Button btnPendataan;
    @FXML
    private Button BtnHome;
    @FXML
    private Button BtnDashboard;
    @FXML
    private Button btnBack;
    @FXML
    private Button btnResi;
    @FXML
    private Button btnStatistik;
    @FXML
    private Button btnPeriksaP;
    @FXML
    private Button btnAkun;
    @FXML
    private Button btnLihatDokumen;

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

    @FXML
    private void toStatistik(ActionEvent event) throws IOException {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("StatistikPengguna1");
        homepagePane.setCenter(halaman);
    }

    @FXML
    private void toPendataan(ActionEvent event) throws IOException {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("PilihPendataan");
        homepagePane.setCenter(halaman);
    }

    @FXML
    private void toPeriksaP(ActionEvent event) throws IOException {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("periksaPendataan");
        homepagePane.setCenter(halaman);
    }

    @FXML
    private void toResi(ActionEvent event) throws IOException {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("Resi");
        homepagePane.setCenter(halaman);
    }

    @FXML
    private void toAkun(ActionEvent event) throws IOException {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("EditProfil");
        homepagePane.setCenter(halaman);
    }

    @FXML
    private void toLihatDokumen(ActionEvent event) throws IOException {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("MelihatDok");
        homepagePane.setCenter(halaman);
    }

    @FXML
    void toPendataanKTP(MouseEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/view/pendataanForm.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @FXML
    void toPrint(MouseEvent event) {
        try {
            root = FXMLLoader.load(getClass().getResource("/view/pendataanForm.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
