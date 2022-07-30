package util;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

import java.net.URL;

public class OpenScene {
    private Pane halaman;

    public Pane getPane(String fileName) {
        try {
            // FXMLLoader.load(getClass().getResource("/fxml/Login.fxml"))
            URL fileHalaman = main.MyDesa.class.getResource("/view/" + fileName + ".fxml");

            if (fileHalaman == null) {
                throw new java.io.FileNotFoundException("Halaman tidak ditemukan");
            }
            halaman = new FXMLLoader().load(fileHalaman);
        } catch (Exception e) {
            System.out.println("Tidak ditemukan halaman tersebut.");
        }
        return halaman;
    }
}
