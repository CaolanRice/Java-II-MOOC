
package application;

import java.util.Random;

/**
 *
 * @author Caolan
 */
public class TemperatureSensor implements Sensor {
    private boolean sensorState;
    
    public TemperatureSensor(){
        this.sensorState = false;
    }

    @Override
    public boolean isOn() {
        return sensorState;
    }

    @Override
    public void setOn() {
        this.sensorState = true;
    }

    @Override
    public void setOff() {
        this.sensorState = false;
    }

    @Override
    public int read() {
        int randomInteger = new Random().nextInt(61) - 30;
        if (sensorState == true){
            return randomInteger;
        }
        throw new IllegalStateException("The sensor is not turned on");
    }
    
    
    
}
