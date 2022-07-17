package controller;

import java.net.URL;
import java.util.ResourceBundle;
import static javafx.collections.FXCollections.observableArrayList;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.modelKtp;

public class periksaPendataan implements Initializable {
  @FXML
  private TableView table;
  // @FXML
  // private TextField tfUsername;
  // @FXML
  // private TextField tfEmail;
  // @FXML
  // private TextField tfNomorHP;
  // @FXML
  // private TextField tfNamaAsli;
  // @FXML
  // private TextField tfNIK;
  // @FXML
  // private TextField tfNoKK;
  // @FXML
  // private TextField tfTempatLahir;
  // @FXML
  // private TextField tfTanggalLahir;
  // @FXML
  // private TextField tfAlamat;
  // @FXML
  // private TextField tfRT;
  // @FXML
  // private TextField tfRW;
  // @FXML
  // private TextField tfPekerjaan;
  // @FXML
  // private TextField tfJenisKelamin;
  // @FXML
  // private TextField tfStatusKawin;
  // @FXML
  // private TextField tfKewarganegaraan;
  // @FXML
  // private TextField tfAgama;
  // @FXML
  // private TextField tfGolDarah;

  @FXML
  private TableColumn tCAksi;
  @FXML
  private TableColumn tCUsername;
  @FXML
  private TableColumn tCEmail;
  @FXML
  private TableColumn tCNomorHP;
  @FXML
  private TableColumn tCNamaAsli;
  @FXML
  private TableColumn tCNIK;
  @FXML
  private TableColumn tCNoKK;
  @FXML
  private TableColumn tCTempatLahir;
  @FXML
  private TableColumn tCTanggalLahir;
  @FXML
  private TableColumn tCAlamat;
  @FXML
  private TableColumn tCRT;
  @FXML
  private TableColumn tCRW;
  @FXML
  private TableColumn tCPekerjaan;
  @FXML
  private TableColumn tCJenisKelamin;
  @FXML
  private TableColumn tCStatusKawin;
  @FXML
  private TableColumn tCKewarganegaraan;
  @FXML
  private TableColumn tCAgama;
  @FXML
  private TableColumn tCGolDarah;
  @FXML
  private TableColumn tCPassword;

  @FXML
  private Button btnBack;

  ObservableList data = observableArrayList(
      new modelKtp("Bintang Rahmatullah", "bint_r", "72195878951329", "Palu",
          "18/09/20", "09887641232",
          "bintang@gmail.com", "1234", "Mahasiswa", "Jln. Kaliurang",
          "712812788978124", "Laki-laki", "005", "001", "B",
          "Belum Kawin", "WNI", "Islam"),
      new modelKtp("Bintang Rahmatullah", "bint_r", "72195878951329", "Palu",
          "18/09/20", "09887641232",
          "bintang@gmail.com", "1234", "Mahasiswa", "Jln. Kaliurang",
          "712812788978124", "Laki-laki", "005", "001", "B",
          "Belum Kawin", "WNI", "Islam"));

  // @FXML
  // private void handleButtonActions(ActionEvent event) {
  // String temp0 = tfNamaAsli.getText();
  // String temp1 = tfUsername.getText();
  // String temp2 = tfEmail.getText();
  // String temp3 = tfNomorHP.getText();
  // String temp4 = tfNamaAsli.getText();
  // String temp5 = tfNIK.getText();
  // String temp6 = tfNoKK.getText();
  // String temp7 = tfTempatLahir.getText();
  // String temp8 = tfTanggalLahir.getText();
  // String temp9 = tfAlamat.getText();
  // String temp10 = tfRT.getText();
  // String temp11 = tfRW.getText();
  // String temp12 = tfPekerjaan.getText();
  // String temp13 = tfJenisKelamin.getText();
  // String temp14 = tfStatusKawin.getText();
  // String temp15 = tfKewarganegaraan.getText();
  // String temp16 = tfAgama.getText();
  // String temp17 = tfGolDarah.getText();
  // data.add(new modelKtp(temp0, temp1, temp2, temp3, temp4, temp5, temp6, temp7,
  // temp8, temp9, temp10, temp11, temp12,
  // temp13, temp14, temp15, temp16, temp17));
  // } // end of handleButtonActions);

  // tfNama.setText("");
  // tfEmail.setText("");
  // tfPassword.setText("");
  // tfNomorHP.setText("");

  /**
   * Initializes the controller class.
   * 
   * @param url
   * @param rb
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {

    tCNamaAsli.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nama"));
    tCUsername.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("username"));
    tCNIK.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nIK"));

    tCTempatLahir.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("tempatLahir"));
    tCTanggalLahir.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("tanggalLahir"));
    tCNomorHP.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("nomorHP"));
    tCEmail.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("email"));
    tCPassword.setCellValueFactory(new PropertyValueFactory<modelKtp, String>("password"));
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

    table.setItems(data);
  }
}
