package model;

import java.sql.Date;

import javafx.collections.ObservableList;

import static javafx.collections.FXCollections.observableArrayList;

public class modelKtp extends Pengguna {
  String rT;
  String rW;
  String golDarah;
  String statusKawin;
  String kewargaNegaraan;
  String agama;

  public modelKtp(String nama, String username, String nIK, String tempatLahir, String tanggalLahir, String nomorHP,
      String email, String password, String pekerjaan, String alamat, String nomorKK, String jenisKelamin, String rT,
      String rW, String golDarah, String statusKawin, String kewargaNegaraan, String agama) {
    super(nama, username, nIK, tempatLahir, tanggalLahir, nomorHP, email, password, pekerjaan, alamat, nomorKK,
        jenisKelamin);
    this.rT = rT;
    this.rW = rW;
    this.golDarah = golDarah;
    this.statusKawin = statusKawin;
    this.kewargaNegaraan = kewargaNegaraan;
    this.agama = agama;
  }

  public String getrT() {
    return rT;
  }

  public void setrT(String rT) {
    this.rT = rT;
  }

  public String getrW() {
    return rW;
  }

  public void setrW(String rW) {
    this.rW = rW;
  }

  public String getGolDarah() {
    return golDarah;
  }

  public void setGolDarah(String golDarah) {
    this.golDarah = golDarah;
  }

  public String getStatusKawin() {
    return statusKawin;
  }

  public void setStatusKawin(String statusKawin) {
    this.statusKawin = statusKawin;
  }

  public String getKewargaNegaraan() {
    return kewargaNegaraan;
  }

  public void setKewargaNegaraan(String kewargaNegaraan) {
    this.kewargaNegaraan = kewargaNegaraan;
  }

  public String getAgama() {
    return agama;
  }

  public void setAgama(String agama) {
    this.agama = agama;
  }

}
