package workshop;

public class WorkShop {

    public static void main(String[] args) {
      TempSensor temp1 = new TempSensor(22, "Temperature", "Sensor1");
      TempSensor temp2 = new TempSensor(18, "Temperature", "Sensor2");
      TempSensor temp3 = new TempSensor(16, "Temperature", "Sensor3");
      TempSensor temp4 = new TempSensor(20, "Temperature", "Sensor4");
      
      Co2Sensor co1 = new Co2Sensor(210, "Co2", "Co2 Sensor1");
      Co2Sensor co2 = new Co2Sensor(110, "Co2", "Co2 Sensor2");
      Co2Sensor co3 = new Co2Sensor(310, "Co2", "Co2 Sensor3");
      Co2Sensor co4 = new Co2Sensor(410, "Co2", "Co2 Sensor4");
      Co2Sensor co5 = new Co2Sensor(910, "Co2", "Co2 Sensor5");
      
      Aktuator aktu1 = new Aktuator(20,"Aktuator 1");
      Aktuator aktu2 = new Aktuator(40,"Aktuator 2");
      Aktuator aktu3 = new Aktuator(10,"Aktuator 3");
      Aktuator aktu4 = new Aktuator(54,"Aktuator 4");
      
      Building building1 = new Building("Building 1");
      Building building2 = new Building("Building 2");
      Building building3 = new Building("Building 3");
      Building building4 = new Building("Building 4");
      Building building5 = new Building("Building 5");
      
      
      
    }
    
}
