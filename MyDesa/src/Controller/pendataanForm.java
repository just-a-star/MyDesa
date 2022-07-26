package controller;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Resi;
import model.modelKtp;
import util.DateIncrementer;
import util.RandomString;

import static javafx.collections.FXCollections.observableArrayList;

public class pendataanForm {
    public static ObservableList<modelKtp> dataKtp = observableArrayList();
    public static ObservableList<Resi> dataResi = observableArrayList();
    int ID = 0;
    String status = "Pending";

    // @FXML
    // private TableView table;
    @FXML
    private TextField tfUsername;
    @FXML
    private TextField tfEmail;
    @FXML
    private TextField tfNomorHP;
    @FXML
    private TextField tfNamaAsli;
    @FXML
    private TextField tfNIK;
    @FXML
    private TextField tfNoKK;
    @FXML
    private TextField tfTempatLahir;
    @FXML
    private TextField tfTanggalLahir;
    @FXML
    private TextField tfAlamat;
    @FXML
    private TextField tfRT;
    @FXML
    private TextField tfRW;
    @FXML
    private TextField tfPekerjaan;
    @FXML
    private TextField tfJenisKelamin;
    @FXML
    private TextField tfStatusKawin;
    @FXML
    private TextField tfKewarganegaraan;
    @FXML
    private TextField tfAgama;
    @FXML
    private TextField tfGolDarah;
    @FXML
    private Button btnSubmit;
//    System.out.println(tanggalNow);

    @FXML
    private void handleBtnSubmit(ActionEvent event) {

        String temp0 = tfNamaAsli.getText();
        String temp1 = tfEmail.getText();
        String temp2 = tfNomorHP.getText();
        String temp3 = tfNIK.getText();
        String temp4 = tfNoKK.getText();
        String temp5 = tfTempatLahir.getText();
        String temp6 = tfTanggalLahir.getText();
        String temp7 = tfAlamat.getText();
        String temp8 = tfRT.getText();
        String temp9 = tfRW.getText();
        String temp10 = tfPekerjaan.getText();
        String temp11 = tfJenisKelamin.getText();
        String temp12 = tfStatusKawin.getText();
        String temp13 = tfKewarganegaraan.getText();
        String temp14 = tfAgama.getText();
        String temp15 = tfGolDarah.getText();
        status = "Pending Sedang Di Proses";
        ID = ID + 1;
        String keterangan = "-";
        String nomorResi = RandomString.getAlphaNumericString(10);
        String tanggalAmbil = DateIncrementer.addOneDay(0);
        dataKtp.add(new modelKtp(temp0, temp1, temp2, temp3, temp4, temp5, temp6, temp7,
                temp8, temp9, temp10, temp11, temp12,
                temp13, temp14, temp15, status, ID));
        System.out.println(dataKtp.get(0).getAgama());
        System.out.println(tanggalAmbil);
        dataResi.add(new Resi(ID, temp0, tanggalAmbil, nomorResi, keterangan, status));
//        int id;
//        String nama;
//        Date tanggal;
//        String nomorResi;
//        String keterangan;
    }


//    @Override
//    public void initialize(URL url, ResourceBundle rb) {

//        tCNamaAsli.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nama"));
//        tCUsername.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("username"));
//        tCNIK.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nIK"));
//
//        tCTempatLahir.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("tempatLahir"));
//        tCTanggalLahir.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("tanggalLahir"));
//        tCNomorHP.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nomorHP"));
//        tCEmail.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("email"));
//        tCPassword.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("password"));
//        tCPekerjaan.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("pekerjaan"));
//        tCAlamat.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("alamat"));
//        tCNoKK.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nomorKK"));
//        tCJenisKelamin.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("jenisKelamin"));
//
//        tCRT.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("rT"));
//        tCRW.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("rW"));
//        tCGolDarah.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("golDarah"));
//        tCStatusKawin.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("statusKawin"));
//        tCKewarganegaraan.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("kewargaNegaraan"));
//        tCAgama.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("agama"));
//
//        table.setItems(data);
}


