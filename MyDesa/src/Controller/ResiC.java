package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import model.Resi;

import java.net.URL;
import java.util.ResourceBundle;

public class ResiC implements Initializable {
    public static ObservableList<Resi> dataResi = pendataanForm.dataResi;


    @FXML
    public TableView<Resi> table;

    @FXML
    private TableColumn<Resi, Integer> tcID;

    @FXML
    private TableColumn<Resi, String> tcKeterangan;

    @FXML
    private TableColumn<Resi, String> tcNama;

    @FXML
    private TableColumn<Resi, String> tcNomorResi;

    @FXML
    private TableColumn<Resi, String> tcStatus;

    @FXML
    private TableColumn<Resi, String> tcTanggalAmbil;

    @FXML
    private TextField tfSearch;

    @FXML
    private Button btnCancel;

    @FXML
    void cancelPendataan(ActionEvent event) {
        ObservableList<Resi> currentTableDataResi = ResiC.dataResi;
        int currentId = Integer.parseInt(tfSearch.getText());
        System.out.println(currentId);
//        System.out.println(dataResi.get);
        for (Resi dataResi : currentTableDataResi) {
            System.out.println(dataResi.getId());
            if (dataResi.getId() == currentId) {
//                dataResi.setId(Integer.parseInt(tfSearch.getText()));
//                dataResi.setStatus(tFStatus.getText());
//                dataResi.setKeterangan(tFKeterangan.getText());
//                dataResi.setTanggalAmbil(tFDatePicker.getValue().toString());
                table.getItems().remove(dataResi);
                table.setItems(currentTableDataResi);
                table.refresh();

            }
        }
    }

    @FXML
    void rowClicked(MouseEvent event) {
        Resi resi = table.getSelectionModel().getSelectedItem();
        tfSearch.setText(String.valueOf(resi.getId()));
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tcID.setCellValueFactory(new PropertyValueFactory<>("id"));
        tcKeterangan.setCellValueFactory(new PropertyValueFactory<>("keterangan"));
        tcNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
        tcNomorResi.setCellValueFactory(new PropertyValueFactory<>("nomorResi"));
        tcStatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        tcTanggalAmbil.setCellValueFactory(new PropertyValueFactory<>("tanggalAmbil"));

        table.setItems(dataResi);
    }
//int id, String nama, String tanggalAmbil, String nomorResi, String keterangan, String status
}
