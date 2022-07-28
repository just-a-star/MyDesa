package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import util.OpenScene;

import java.io.IOException;

public class PilihPendataanC {
    MenuAplikasiC menuAplikasiC = new MenuAplikasiC();
    //    @FXML
//    private BorderPane homepagePane;
    @FXML
    private Stage stage;
    @FXML
    private Parent root;
    @FXML
    private Scene scene;
    @FXML
    private Rectangle rcKTP;

    @FXML
    private ImageView ivKTP;

    @FXML
    private ImageView ivKK;

    @FXML
    private ImageView ivAkte;

    @FXML
    void toPendataanKTP(MouseEvent event) {
        OpenScene object = new OpenScene();
        Pane halaman = object.getPane("pendataanForm");
        menuAplikasiC.homepagePane.setCenter(halaman);

    }

    public void toPKTP(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/src/view/pendataanForm.fxml"));

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
