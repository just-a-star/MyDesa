package model;

import java.sql.Date;

public class Pengguna {

  String Nama;
  String Username;
  String NIK;
  String TempatLahir;
  String TanggalLahir;
  String NomorHP;
  String Email;
  String Password;
  String Pekerjaan;
  String Alamat;
  String NomorKK;
  String JenisKelamin;

  public Pengguna(String nama, String username, String nIK, String tempatLahir, String tanggalLahir, String nomorHP,
      String email, String password, String pekerjaan, String alamat, String nomorKK, String jenisKelamin) {
    Nama = nama;
    Username = username;
    NIK = nIK;
    TempatLahir = tempatLahir;
    TanggalLahir = tanggalLahir;
    NomorHP = nomorHP;
    Email = email;
    Password = password;
    Pekerjaan = pekerjaan;
    Alamat = alamat;
    NomorKK = nomorKK;
    JenisKelamin = jenisKelamin;
  }

  public String getNama() {
    return Nama;
  }

  public void setNama(String nama) {
    Nama = nama;
  }

  public String getUsername() {
    return Username;
  }

  public void setUsername(String username) {
    Username = username;
  }

  public String getNIK() {
    return NIK;
  }

  public void setNIK(String nIK) {
    NIK = nIK;
  }

  public String getTempatLahir() {
    return TempatLahir;
  }

  public void setTempatLahir(String tempatLahir) {
    TempatLahir = tempatLahir;
  }

  public String getTanggalLahir() {
    return TanggalLahir;
  }

  public void setTanggalLahir(String tanggalLahir) {
    TanggalLahir = tanggalLahir;
  }

  public String getNomorHP() {
    return NomorHP;
  }

  public void setNomorHP(String nomorHP) {
    NomorHP = nomorHP;
  }

  public String getEmail() {
    return Email;
  }

  public void setEmail(String email) {
    Email = email;
  }

  public String getPassword() {
    return Password;
  }

  public void setPassword(String password) {
    Password = password;
  }

  public String getPekerjaan() {
    return Pekerjaan;
  }

  public void setPekerjaan(String pekerjaan) {
    Pekerjaan = pekerjaan;
  }

  public String getAlamat() {
    return Alamat;
  }

  public void setAlamat(String alamat) {
    Alamat = alamat;
  }

  public String getNomorKK() {
    return NomorKK;
  }

  public void setNomorKK(String nomorKK) {
    NomorKK = nomorKK;
  }

  public String getJenisKelamin() {
    return JenisKelamin;
  }

  public void setJenisKelamin(String jenisKelamin) {
    JenisKelamin = jenisKelamin;
  }
}
