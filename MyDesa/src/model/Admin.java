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

public class Admin {
  private String nama;
  private String userName;
  private String password;

  public Admin() {
    this.nama = "Bintang Rahmatullah";
    this.userName = "Admin";
    this.password = "Admin";
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
