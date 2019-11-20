/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop;

/**
 *
 * @author nicol
 */
public class TempSensor extends Sensor{
    private double temp;

    public TempSensor(double temp, String type, String IDString) {
        super(type, IDString);
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }
    
    
    
}
