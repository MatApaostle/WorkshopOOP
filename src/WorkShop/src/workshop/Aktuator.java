package workshop;

public class Aktuator {
    private int value;
    private String IDString;

    public Aktuator(int value, String IDString) {
        this.value = value;
        this.IDString = IDString;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getIDString() {
        return IDString;
    }
    
    
}
