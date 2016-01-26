/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopt_week1;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 *
 * @author ironman
 */
public class OOPT_week1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Jee");
        Customer customer = new Customer("KAlle", "Kuhtaa");
        Car car = new Car("Audi", "A3");
        LocalDate start = LocalDate.now();
        LocalDate end = start.plus(1, ChronoUnit.DAYS);
        Rental rental = new Rental(customer, car, start, end);
        System.out.println(rental);
    }
    
}
