package model;

import java.sql.Date;

public class Pengguna {

  String Nama;
  String Username;
  long NIK;
  String TempatLahir;
  Date TanggalLahir;
  String NomorHP;
  String Email;
  String Password;
  String Role;
  String Alamat;

  public Pengguna(String nama, String username, long nIK, String tempatLahir, Date tanggalLahir, String nomorHP,
      String email, String password, String role, String alamat) {
    this.Nama = nama;
    this.Username = username;
    this.NIK = nIK;
    this.TempatLahir = tempatLahir;
    this.TanggalLahir = tanggalLahir;
    this.NomorHP = nomorHP;
    this.Email = email;
    this.Password = password;
    this.Role = role;
    this.Alamat = alamat;
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

  public long getNIK() {
    return NIK;
  }

  public void setNIK(long nIK) {
    NIK = nIK;
  }

  public String getTempatLahir() {
    return TempatLahir;
  }

  public void setTempatLahir(String tempatLahir) {
    TempatLahir = tempatLahir;
  }

  public Date getTanggalLahir() {
    return TanggalLahir;
  }

  public void setTanggalLahir(Date tanggalLahir) {
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

  public String getRole() {
    return Role;
  }

  public void setRole(String role) {
    Role = role;
  }

  public String getAlamat() {
    return Alamat;
  }

  public void setAlamat(String alamat) {
    Alamat = alamat;
  }

}