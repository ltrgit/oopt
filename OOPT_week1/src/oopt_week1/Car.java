package oopt_week1;

public class Car {

    private String manufacturer;

    private int year;

    private int manuYear;

    private int databaseID;

    private String model;
    
    Car(String manu, String mod){
        manufacturer = manu;
        model = mod;
    }

    public String getType() {
        return manufacturer + " " + model;
    }
}
