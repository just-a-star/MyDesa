// package controller;

// import java.net.URL;
// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.util.ResourceBundle;

// import helpers.DbConnect;
// import javafx.collections.FXCollections;
// import javafx.collections.ObservableList;
// import javafx.fxml.FXML;
// import javafx.scene.control.TableColumn;
// import javafx.scene.control.TableView;
// import javafx.scene.control.cell.PropertyValueFactory;
// import model.Pengguna;

// public class MengaturAkunC {

// @FXML
// private TableView<Pengguna> tvDataMasyarakat;

// @FXML
// private TableView<Pengguna> tvDataAdministrator;

// @FXML
// private TableColumn<Pengguna, String> tcNama;

// @FXML
// private TableColumn<Pengguna, String> tcUsername;

// @FXML
// private TableColumn<Pengguna, String> tcNIK;

// @FXML
// private TableColumn<Pengguna, String> tcTempatLahir;

// @FXML
// private TableColumn<Pengguna, String> tcTanggalLahir;

// @FXML
// private TableColumn<Pengguna, String> tcNomorHP;

// @FXML
// private TableColumn<Pengguna, String> tcEmail;

// @FXML
// private TableColumn<Pengguna, String> tcPassword;

// @FXML
// private TableColumn<Pengguna, String> tcAlamat;

// @FXML
// private void refreshTable() {

// try {
// PenggunaList.clear();

// query = "SELECT * FROM pengguna";
// preparedStatement = connection.prepareStatement(query);
// resultSet = preparedStatement.executeQuery();

// while(resultSet.next()){
// PenggunaList.add(new Pengguna(
// resultSet.getString("nama"),
// resultSet.getString("username"),
// resultSet.getLong("nIK"),
// resultSet.getString("tempatLahir"),
// resultSet.getDate("tanggalLahir"),
// resultSet.getString("nomorHP"),
// resultSet.getString("email"),
// resultSet.getString("password"),
// resultSet.getString("role"),
// resultSet.getString("alamat")
// ));
// //String nama, String username, long nIK, String tempatLahir, Date
// tanggalLahir, String nomorHP,
// //String email, String password, String role, String alamat

// }
// }
// }

// String query = null;
// Connection connection = null;
// PreparedStatement preparedStatement = null;
// ResultSet resultSet = null;
// Pengguna Pengguna = null;

// ObservableList<Pengguna> PenggunaList = FXCollections.observableArrayList();

// private void loadDate() {

// connection = DbConnect.getConnect();

// tcNama.setCellValueFactory(new PropertyValueFactory<>("nama"));
// tcUsername.setCellValueFactory(new PropertyValueFactory<>("username"));
// tcNIK.setCellValueFactory(new PropertyValueFactory<>("nik"));
// tcTempatLahir.setCellValueFactory(new PropertyValueFactory<>("tempatLahir"));
// tcTanggalLahir.setCellValueFactory(new
// PropertyValueFactory<>("tanggalLahir"));
// tcNomorHP.setCellValueFactory(new PropertyValueFactory<>("nomorHP"));
// tcEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
// tcPassword.setCellValueFactory(new PropertyValueFactory<>("password"));
// tcAlamat.setCellValueFactory(new PropertyValueFactory<>("alamat"));

// }

// @Override
// public void initialize(URL url, ResourceBundle rb) {
// // TODO
// loadDate();
// }
// }
