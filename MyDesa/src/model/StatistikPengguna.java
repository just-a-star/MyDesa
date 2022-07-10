package model;

import java.util.Random;

public class StatistikPengguna {
  public int jumlahPengguna;
  public int jumlahPendataan;
  public String tanggal;

  public StatistikPengguna(int jumlahPengguna, int jumlahPendataan, String tanggal) {
    this.jumlahPengguna = jumlahPengguna;
    this.jumlahPendataan = jumlahPendataan;
    this.tanggal = tanggal;
  }

  public static int getJumlahPengguna() {
    Random generate = new Random();
    int jumlahPengguna = generate.nextInt(100) + 1;
    return jumlahPengguna;
  }

  public void setJumlahPengguna(int jumlahPengguna) {
    this.jumlahPengguna = jumlahPengguna;
  }

  public int getJumlahPendataan() {
    return jumlahPendataan;
  }

  public void setJumlahPendataan(int jumlahPendataan) {
    this.jumlahPendataan = jumlahPendataan;
  }

  public String getTanggal() {

    return tanggal;
  }

  public void setTanggal(String tanggal) {
    this.tanggal = tanggal;
  }

  @Override
  public String toString() {
    return "jumlahPengguna=" + jumlahPengguna + ", jumlahPendataan=" + jumlahPendataan + "]";
  }

}
