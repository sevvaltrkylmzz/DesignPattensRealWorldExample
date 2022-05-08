package project3;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject {
   private List<Observer> customers=new ArrayList<>();
   private String availability;
   private int productPrice;
   public Brand brand;

    public Publisher(Brand brand, int productPrice, String availability) {
        this.brand=brand;
        this.productPrice=productPrice;
        this.availability=availability;
    }

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        if(!customers.contains(obj)) customers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        customers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Product Name: "
                          +brand.toString().toLowerCase()+ ", product price: "
                          +productPrice+ " is now available."
        );
        for (Observer customer:customers){
            customer.update(availability);
        }
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        System.out.println("Availability changed from Out of Stock to Available");
        notifyObservers();
    }

    public String getAvailability() {
        return availability;
    }
}
