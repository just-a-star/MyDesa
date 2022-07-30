package model;

import javafx.collections.ObservableList;

import static javafx.collections.FXCollections.observableArrayList;

public class modelKtp extends Pengguna {
    public static ObservableList<modelKtp> dataKtp = observableArrayList(
            new modelKtp("Bintang Rahmatullah", "bint_r", "72195878951329", "Palu",
                    "18/09/20", "09887641232",
                    "bintang@gmail.com", "1234", "Mahasiswa", "Jln. Kaliurang",
                    "712812788978124", "Laki-laki", "005", "001", "B",
                    "Belum Kawin", "WNI", "Islam"));
    String rT;
    String rW;
    String golDarah;
    String statusKawin;
    String kewargaNegaraan;
    String agama;


    String status;
    int id;

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

    public modelKtp(String nama, String nIK, String tempatLahir, String tanggalLahir, String nomorHP,
                    String email, String pekerjaan, String alamat, String nomorKK, String jenisKelamin, String rT,
                    String rW, String golDarah, String statusKawin, String kewargaNegaraan, String agama) {
        super(nama, nIK, tempatLahir, tanggalLahir, nomorHP, email, pekerjaan, alamat, nomorKK,
                jenisKelamin);
        this.rT = rT;
        this.rW = rW;
        this.golDarah = golDarah;
        this.statusKawin = statusKawin;
        this.kewargaNegaraan = kewargaNegaraan;
        this.agama = agama;

    }

    public modelKtp(String nama, String nIK, String tempatLahir, String tanggalLahir, String nomorHP,
                    String email, String pekerjaan, String alamat, String nomorKK, String jenisKelamin, String rT,
                    String rW, String golDarah, String statusKawin, String kewargaNegaraan, String agama, String status, int id) {
        super(nama, nIK, tempatLahir, tanggalLahir, nomorHP, email, pekerjaan, alamat, nomorKK,
                jenisKelamin);
        this.rT = rT;
        this.rW = rW;
        this.golDarah = golDarah;
        this.statusKawin = statusKawin;
        this.kewargaNegaraan = kewargaNegaraan;
        this.agama = agama;
        this.status = status;
        this.id = id;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRT() {
        return rT;
    }

    public void setRT(String rT) {
        this.rT = rT;
    }

    public String getRW() {
        return rW;
    }

    public void setRW(String rW) {
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
