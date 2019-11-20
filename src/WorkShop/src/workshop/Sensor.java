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
public class Sensor {
    private String type;
    private String IDString;

    public Sensor(String type, String IDString) {
        this.type = type;
        this.IDString = IDString;
    }

    public String getType() {
        return type;
    }

    public String getIDString() {
        return IDString;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setIDString(String IDString) {
        this.IDString = IDString;
    }
    
    
    
}
