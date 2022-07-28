package model;

// public class Admin {
//   private String nama;
//   private String username;
//   private String password;

//   public Admin() {
//     this.nama = "admin";
//     this.username = "admin";
//     this.password = "admin";
//   }

// public Admin() { // Method overloading
// this("admin", "admin", "admin");
// }

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Admin {
    private String nama;
    private String userName;
    private String password;

    public Admin() {
        this.nama = "Bintang Rahmatullah";
        this.userName = "Admin";
        this.password = "Admin";
    }

    public Admin(String nama, String userName, String password) {
        this.nama = nama;
        this.userName = userName;
        this.password = password;
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

    public void simpanData(String nama, String userName, String password) {
        Admin univ = new Admin(nama, userName, password);
        XStream xstream = new XStream(new StaxDriver());

        String sxml = xstream.toXML(univ);

        FileOutputStream f = null;
        File file = new File("DataXML/admin.xml");
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


    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
