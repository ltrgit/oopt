package oopt_week1;

import java.time.LocalDate;

public class Rental {

    private Customer customer;

    private Car car;

    private LocalDate startDate;

    private LocalDate endDate;

    public void Rental() {
    }

    Rental(Customer customer, Car car, LocalDate startDate, LocalDate endDate) {
        this.customer = customer;
        this.car = car;
        this.endDate = endDate;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        String text = "Car: " + car.getType() + ", Customer: " + customer.getName();
        text += ", Start date: " + startDate + ", End date: " + endDate;
        return text;
    }
}
