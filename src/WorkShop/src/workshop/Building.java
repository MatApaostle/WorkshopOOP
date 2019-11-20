package workshop;

import java.util.ArrayList;

/**
 *
 * @author liseolsen
 */
public class Building {
   private String name;
   private ArrayList<Sensor> sensors = new ArrayList<>();
   private ArrayList<Aktuator> aktuators = new ArrayList<>();

    public Building(String name) {
        this.name = name;
    }
   
    public String getName() {
        return name;
    }

    public ArrayList<Sensor> getSensor() {
        return sensors;
    }

    public ArrayList<Aktuator> getAktuator() {
        return aktuators;
    }
    
    public void addSensor(Sensor obj){
        sensors.add(obj);
    }
    
    public void removeSensor(Sensor obj){
        sensors.remove(obj);
    }
    
    public void addAktuator(Aktuator obj){
        aktuators.add(obj);
    }
    public void removeAktuator(Aktuator obj){
        aktuators.remove(obj);
    }
}
