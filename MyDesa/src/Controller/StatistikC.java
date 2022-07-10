package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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

  XYChart.Series<String, Integer> LineChart = new XYChart.Series();

  @FXML
  private void handleBtnTambah(ActionEvent event) {
    for (int i = 0; i <= 30; i++) {

      String x = Integer.toString(i);
      int y = StatistikPengguna.getJumlahPengguna();
      LineChart.getData().add(new XYChart.Data<>(x, y));
      labelLC.setText(x + " : " + y);

    }
  }

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
    LineChart.getData().add(new XYChart.Data<>("Jan-1", 100));
    LineChart.getData().add(new XYChart.Data<>("Jan-2", 90));
    LineChart.getData().add(new XYChart.Data<>("Jan-3", 60));

    LCPenggunaBulanan.getData().add(LineChart);
  }
}
