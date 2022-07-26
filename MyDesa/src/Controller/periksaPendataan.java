package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import model.Resi;
import model.modelKtp;

import java.net.URL;
import java.util.ResourceBundle;

public class periksaPendataan implements Initializable {
    ObservableList<modelKtp> dataKtp = pendataanForm.dataKtp;
    ObservableList<Resi> dataResi = pendataanForm.dataResi;
    ResiC resiC = new ResiC();
    //    table = resiC.table.getItems();
    @FXML
    private TableView<modelKtp> ktp;
    @FXML
    private TableColumn<modelKtp, String> tCEmail;
    @FXML
    private TableColumn<modelKtp, String> tCNomorHP;
    @FXML
    private TableColumn<modelKtp, String> tCNamaAsli;
    @FXML
    private TableColumn<modelKtp, String> tCNIK;
    @FXML
    private TableColumn<modelKtp, String> tCNoKK;
    @FXML
    private TableColumn<modelKtp, String> tCTempatLahir;
    @FXML
    private TableColumn<modelKtp, String> tCTanggalLahir;
    @FXML
    private TableColumn<modelKtp, String> tCAlamat;
    @FXML
    private TableColumn<modelKtp, String> tCRT;
    @FXML
    private TableColumn<modelKtp, String> tCRW;
    @FXML
    private TableColumn<modelKtp, String> tCPekerjaan;
    @FXML
    private TableColumn<modelKtp, String> tCJenisKelamin;
    @FXML
    private TableColumn<modelKtp, String> tCStatusKawin;
    @FXML
    private TableColumn<modelKtp, String> tCKewarganegaraan;
    @FXML
    private TableColumn<modelKtp, String> tCAgama;
    @FXML
    private TableColumn<modelKtp, String> tCGolDarah;
    @FXML
    private TableColumn<modelKtp, String> tCStatus;
    @FXML
    private TableColumn<modelKtp, Integer> tCID;
    @FXML
    private Button btnSubmit;
    @FXML
    private Label lbAgama;
    @FXML
    private Label lbAlamat;
    @FXML
    private Label lbEmail;
    @FXML
    private Label lbGolDarah;
    @FXML
    private Label lbID;
    @FXML
    private Label lbJenisKelamin;
    @FXML
    private Label lbKewarganegaraan;
    @FXML
    private Label lbNama;
    @FXML
    private Label lbNoKK;
    @FXML
    private Label lbNomorHP;
    @FXML
    private Label lbPekerjaan;
    @FXML
    private Label lbRT;
    @FXML
    private Label lbRW;
    @FXML
    private Label lbStatus;
    @FXML
    private Label lbStatusKawin;
    @FXML
    private Label lbTanggalLahir;
    @FXML
    private Label lbTempatLahir;
    @FXML
    private TextField tFID;
    @FXML
    private TextField tFStatus;
    @FXML
    private TextField tFKeterangan;
    @FXML
    private DatePicker tFDatePicker;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        tCNamaAsli.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nama"));
        tCID.setCellValueFactory(new PropertyValueFactory<modelKtp, Integer>("id"));
        tCNIK.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nIK"));

        tCTempatLahir.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("tempatLahir"));
        tCTanggalLahir.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("tanggalLahir"));
        tCNomorHP.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nomorHP"));
        tCEmail.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("email"));
        tCStatus.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("status"));
        tCPekerjaan.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("pekerjaan"));
        tCAlamat.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("alamat"));
        tCNoKK.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nomorKK"));
        tCJenisKelamin.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("jenisKelamin"));

        tCRT.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("rT"));
        tCRW.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("rW"));
        tCGolDarah.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("golDarah"));
        tCStatusKawin.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("statusKawin"));
        tCKewarganegaraan.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("kewargaNegaraan"));
        tCAgama.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("agama"));

        ktp.setItems(dataKtp);
    }

    @FXML
    void handleSubmit(ActionEvent event) {
        ubahDataKtp();
        ubahDataResi();

    }

    void ubahDataKtp() {
        ObservableList<modelKtp> currentTableData = ktp.getItems();

        int currentId = Integer.parseInt(tFID.getText());

        for (modelKtp dataKtp : currentTableData) {
            if (dataKtp.getId() == currentId) {
                dataKtp.setId(Integer.parseInt(tFID.getText()));
                dataKtp.setStatus(tFStatus.getText());
                lbStatus.setText(tFStatus.getText());

                ktp.setItems(currentTableData);
                ktp.refresh();
//                break;
            }
        }
    }

    //    resi = resiC.table.getItems();
    void ubahDataResi() {
        ObservableList<Resi> currentTableDataResi = ResiC.dataResi;
        int currentId = Integer.parseInt(tFID.getText());
        System.out.println(currentId);
//        System.out.println(dataResi.get);
        for (Resi dataResi : currentTableDataResi) {
            System.out.println(dataResi.getId());
            if (dataResi.getId() == currentId) {
                dataResi.setId(Integer.parseInt(tFID.getText()));
                dataResi.setStatus(tFStatus.getText());
                dataResi.setKeterangan(tFKeterangan.getText());
                dataResi.setTanggalAmbil(tFDatePicker.getValue().toString());

                resiC.table.setItems(currentTableDataResi);
                resiC.table.refresh();
//                break;
            }
        }
    }

    @FXML
    void rowClicked(MouseEvent event) {
        modelKtp clickedData = ktp.getSelectionModel().getSelectedItem();
//        Resi clickedDataResi = resiC.table.getSelectionModel().getSelectedItem();
        tFID.setText(String.valueOf(clickedData.getId()));
        tFStatus.setText(String.valueOf(clickedData.getStatus()));
        lbAgama.setText(String.valueOf(clickedData.getAgama()));
        lbAlamat.setText(String.valueOf(clickedData.getAlamat()));
        lbEmail.setText(String.valueOf(clickedData.getEmail()));
        lbGolDarah.setText(String.valueOf(clickedData.getGolDarah()));
        lbID.setText(String.valueOf(clickedData.getId()));
        lbJenisKelamin.setText(String.valueOf(clickedData.getJenisKelamin()));
        lbKewarganegaraan.setText(String.valueOf(clickedData.getKewargaNegaraan()));
        lbNama.setText(String.valueOf(clickedData.getNama()));
        lbNoKK.setText(String.valueOf(clickedData.getNomorKK()));
        lbNomorHP.setText(String.valueOf(clickedData.getNomorHP()));
        lbPekerjaan.setText(String.valueOf(clickedData.getPekerjaan()));
        lbRT.setText(String.valueOf(clickedData.getRT()));
        lbRW.setText(String.valueOf(clickedData.getRW()));
        lbTempatLahir.setText(String.valueOf(clickedData.getTempatLahir()));
        lbTanggalLahir.setText(String.valueOf(clickedData.getTanggalLahir()));
        lbStatusKawin.setText(String.valueOf(clickedData.getStatusKawin()));
        lbStatus.setText(String.valueOf(clickedData.getStatus()));
        ktp.refresh();
        resiC.table.refresh();
    }
//  @FXML
//  private void handleSubmit(ActionEvent event) {
//    ObservableList<modelKtp> currentTableData = dataKtp.getItems();
//    int current
//    System.out.println(dataKtp.get(0).getUsername());
//  }


//  ObservableList data = observableArrayList(
//      new modelKtp("Bintang Rahmatullah", "bint_r", "72195878951329", "Palu",
//          "18/09/20", "09887641232",
//          "bintang@gmail.com", "1234", "Mahasiswa", "Jln. Kaliurang",
//          "712812788978124", "Laki-laki", "005", "001", "B",
//          "Belum Kawin", "WNI", "Islam"),
//      new modelKtp("Bintang Rahmatullah", "bint_r", "72195878951329", "Palu",
//          "18/09/20", "09887641232",
//          "bintang@gmail.com", "1234", "Mahasiswa", "Jln. Kaliurang",
//          "712812788978124", "Laki-laki", "005", "001", "B",
//          "Belum Kawin", "WNIII", "Islam"));


    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */

}
