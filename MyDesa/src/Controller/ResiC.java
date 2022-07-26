package controller;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class Resi {
    ObservableList<model.Resi> dataResi = pendataanForm.dataResi;
    @FXML
    private TableColumn<model.Resi, Integer> tcID;

    @FXML
    private TableColumn<model.Resi, String> tcKeterangan;

    @FXML
    private TableColumn<model.Resi, String> tcNama;

    @FXML
    private TableColumn<model.Resi, String> tcNomorResi;

    @FXML
    private TableColumn<model.Resi, String> tcStatus;

    @FXML
    private TableColumn<model.Resi, String> tcTanggalAmbil;
    

}


