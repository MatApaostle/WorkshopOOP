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
public class Co2Sensor extends Sensor{
    private double co2;

    public Co2Sensor(double co2, String type, String IDString) {
        super(type, IDString);
        this.co2 = co2;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }
    
    
}
