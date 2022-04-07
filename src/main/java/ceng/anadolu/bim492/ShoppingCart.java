package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Icecream;
import ceng.anadolu.bim492.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Icecream> items;

    public ShoppingCart(){
        this.items=new ArrayList<Icecream>();
    }

    public void addItem(Icecream item){
        this.items.add(item);
    }

    public void removeItem(Icecream item){
        this.items.remove(item);
    }

    public double calculateTotalCost(){
        double sum = 0;
        for(Icecream item : items){
            sum += item.cost();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        double amount = calculateTotalCost();
        paymentMethod.pay(amount);

        for(Icecream item : items){
            System.out.println(item.makeIcecream());
        }

    }
}
