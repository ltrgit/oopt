package oopt_week1;

public class Customer {

    private int databaseID;

    private String firstName;

    private String surName;
    
    Customer( String f, String l){
        firstName = f;
        surName = l;
    }

    public String getName() {
        return firstName + " " + surName;
    }
}
