package model;

import javafx.collections.ObservableList;

import static javafx.collections.FXCollections.observableArrayList;

//extend modelKtp
public class Resi {
    public static ObservableList<Resi> dataResi = observableArrayList();
    int id;
    String nama;
    String tanggalAmbil;
    String nomorResi;
    String keterangan;
    String status;

    public Resi(int id, String nama, String tanggalAmbil, String nomorResi, String keterangan, String status) {
        this.id = id;
        this.nama = nama;
        this.tanggalAmbil = tanggalAmbil;
        this.nomorResi = nomorResi;
        this.keterangan = keterangan;
        this.status = status;
    }

    public static ObservableList<Resi> getDataResi() {
        return dataResi;
    }

    public static void setDataResi(ObservableList<Resi> dataResi) {
        Resi.dataResi = dataResi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalAmbil() {
        return tanggalAmbil;
    }

    public void setTanggalAmbil(String tanggalAmbil) {
        this.tanggalAmbil = tanggalAmbil;
    }

    public String getNomorResi() {
        return nomorResi;
    }

    public void setNomorResi(String nomorResi) {
        this.nomorResi = nomorResi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}





