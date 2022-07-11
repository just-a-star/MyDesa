package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import model.StatistikPengguna;

public class StatistikC implements Initializable {

  @FXML
  private LineChart LCPenggunaBulanan;
  @FXML
  private Button btnTambah;

  @FXML
  private Button btnHapus;

  @FXML
  private Label labelLC;

  @FXML
  private TextField tfChart;

  XYChart.Series<String, Integer> LineChart = new XYChart.Series();

  @FXML
  private void handleBtnTambah(ActionEvent event) {
    // tfChart.getText("");
    // String x = tfChart.getText;
    int y = StatistikPengguna.getJumlahPengguna();
    LineChart.getData().add(new XYChart.Data<>(tfChart.getText(), y));
    labelLC.setText(tfChart.getText() + " : " + y);

  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
    LineChart.getData().add(new XYChart.Data<>("Jan-1", 100));
    LineChart.getData().add(new XYChart.Data<>("Jan-2", 90));
    LineChart.getData().add(new XYChart.Data<>("Jan-3", 60));

    LCPenggunaBulanan.getData().add(LineChart);

    LCPenggunaBulanan.setAnimated(false);
  }
}
