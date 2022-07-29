package model;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import javafx.collections.ObservableList;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

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

    public void simpanData(ObservableList<modelKtp> dataKtp) {
//        Admin univ = new Admin(nama, userName, password);
//        modelKtp data = new modelKtp(dataKtp);
        XStream xstream = new XStream(new StaxDriver());

        String sxml = xstream.toXML(dataKtp);

        FileOutputStream f = null;
        File file = new File("DataXML/dataPendataan.xml");
        try {
            // membuat nama file tempat simpan xml
            f = new FileOutputStream(file);
            // mengubah karakter penyusun string xml sebagai bytes
            // bentuk kode ASCII
            byte[] bytes = sxml.getBytes("UTF-8");
            // menulis bytes ke file
            // menyimpan file
            f.write(bytes);
        } catch (Exception e) {
            System.out.println("Perhatian: " + e.getMessage());

        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Data Berhasil disimpan");
    }

    public void bacaData() {
        Admin admin = new Admin();
        XStream xstream = new XStream(new StaxDriver());

        FileInputStream f = null;
        File file = new File("DataXML/admin.xml");

        try {
            f = new FileInputStream(file);
            int isi; // untuk menyimpan kode angka ASCII yang dibaca
            // dari file
            char c;
            String sxml = "";
            // membaca file per karakter
            while ((isi = f.read()) != -1) {
                c = (char) isi;
                sxml = sxml + c;
//                System.out.print(c);
//                System.out.println(sxml);

            }
//            System.out.println(sxml);
            admin = (Admin) xstream.fromXML(sxml);

        } catch (Exception e) {
            System.out.println("Perhatianc: " + e.getMessage());
        } finally {
            if (f != null) {
                try {
                    f.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
        System.out.println(admin);
    }

}
