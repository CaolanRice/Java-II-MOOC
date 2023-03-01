/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caolan
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensorList;
    private ArrayList<Integer> allReadingsList;
    

    public AverageSensor() {
        this.sensorList = new ArrayList<>();
        this.allReadingsList = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        boolean sensorState = true;
        for (Sensor sensor: sensorList){
            if(!sensor.isOn()){
                sensorState = false;
            }
        }
        return sensorState;
    }

    @Override
    public void setOn() {
        sensorList.stream()
                .forEach(sensor -> sensor.setOn());
    }

    @Override
    public void setOff() {
        sensorList.stream()
                .forEach(sensor -> sensor.setOff());
    }

    @Override
    public int read() {
        int sum = 0;
        if (this.isOn() || !this.sensorList.isEmpty()) {
            for (Sensor sensor : sensorList) {
                sum += sensor.read();
            }
            int average = sum / this.sensorList.size();
            this.allReadingsList.add(average);
            return average;
        }
        throw new IllegalStateException("illegal!");
    }

    public void addSensor(Sensor toAdd) {
        this.sensorList.add(toAdd);
    }
    
    public List<Integer> readings(){
        return allReadingsList;
    }

}
