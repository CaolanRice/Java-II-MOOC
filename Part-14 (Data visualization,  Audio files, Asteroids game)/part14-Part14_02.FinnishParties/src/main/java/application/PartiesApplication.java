package application;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    private HashMap<String, HashMap<Integer, Double>> values;

    public PartiesApplication() throws IOException {
        this.values = readData("partiesdata.tsv");
    }

    public static void main(String[] args) throws IOException {
        launch(PartiesApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative Support (%)");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");
        addLines(lineChart);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public HashMap<String, HashMap<Integer, Double>> readData(String fileName) throws IOException {
        HashMap<String, HashMap<Integer, Double>> partyData = new HashMap<>();
        ArrayList<Integer> yearValues = new ArrayList<>();

        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {
            //adds all the year values on the first line of the file to a new arraylist
            String line = scanner.nextLine();
            String[] parts = line.split("\t");

            for (int i = 1; i < parts.length; i++) {
                yearValues.add(Integer.parseInt(parts[i]));
            }

            while (scanner.hasNext()) {
                String nextLine = scanner.nextLine();
                parts = nextLine.split("\t");
                String partyName = parts[0];
                //hashmap to store the voting year and % of votes for each party
                HashMap<Integer, Double> data = new HashMap<>();
                //start on line 1, iterates through the line to 
                for (int i = 1; i < parts.length; i++) {
                    if (!parts[i].equals("-")) {
                        //we start on line 1 so the index of the arraylist must be i - 1 to get correct year;
                        int electionYear = yearValues.get(i - 1);
                        double percentage = Double.parseDouble(parts[i]);
                        //adds the electionyear and percentage vote data to the hashmap
                        data.put(electionYear, percentage);
                    }
                }
                //adds the party name along with all the data to the hashmap
                partyData.put(partyName, data);
            }
        }
        return partyData;
    }

    private void addLines(LineChart<Number, Number> lineChart) {
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });
    }

}
