package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Icecream;

public class Strawberry implements Icecream {
    @Override
    public String makeIcecream() {
        return "Strawberry Ice Cream";
    }

    @Override
    public double cost() {
        return 2.25;
    }
}
