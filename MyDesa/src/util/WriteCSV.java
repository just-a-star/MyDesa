package util;

import org.supercsv.io.CsvListWriter;
import org.supercsv.io.ICsvListWriter;
import org.supercsv.prefs.CsvPreference;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {
    public static void writeCsv(String[][] csvMatrix) {

        ICsvListWriter csvWriter = null;
        try {
            csvWriter = new CsvListWriter(new FileWriter("DataPendataan.csv"),
                    CsvPreference.STANDARD_PREFERENCE);

            for (int i = 0; i < csvMatrix.length; i++) {
                csvWriter.write(csvMatrix[i]);
            }

        } catch (IOException e) {
            e.printStackTrace(); // TODO handle exception properly
        } finally {
            try {
                csvWriter.close();
            } catch (IOException e) {
            }
        }

    }
}




