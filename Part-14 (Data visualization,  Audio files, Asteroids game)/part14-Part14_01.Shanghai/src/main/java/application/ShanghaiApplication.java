package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(2006, 2018, 2);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai Rankings 2007-2017");

        XYChart.Series shanghaiRanking = new XYChart.Series();

        // and single points into the data set
        shanghaiRanking.getData().add(new XYChart.Data(2007, 73));
        shanghaiRanking.getData().add(new XYChart.Data(2008, 68));
        shanghaiRanking.getData().add(new XYChart.Data(2009, 72));
        shanghaiRanking.getData().add(new XYChart.Data(2010, 72));
        shanghaiRanking.getData().add(new XYChart.Data(2011, 74));
        shanghaiRanking.getData().add(new XYChart.Data(2012, 73));
        shanghaiRanking.getData().add(new XYChart.Data(2013, 76));
        shanghaiRanking.getData().add(new XYChart.Data(2014, 73));
        shanghaiRanking.getData().add(new XYChart.Data(2015, 67));
        shanghaiRanking.getData().add(new XYChart.Data(2016, 56));
        shanghaiRanking.getData().add(new XYChart.Data(2017, 56));

        // add the data set to the line chart
        lineChart.getData().add(shanghaiRanking);

        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }

}


//// the axes and the line chart created previously
//
//// data has been read earlier -- the following object contains the data
//Map<String, Map<Integer, Double>> values = // created elsewhere
//
//// go through the parties and add them to the chart
//values.keySet().stream().forEach(party -> {
//    // a different data set for every party
//    XYChart.Series data = new XYChart.Series();
//    data.setName(party);
//
//    // add the party's support numbers to the data set
//    values.get(party).entrySet().stream().forEach(pair -> {
//        data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
//    });
//
//    // and add the data set to the chart
//    lineChart.getData().add(data);
//});