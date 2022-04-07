package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Icecream;

public class Vanilla implements Icecream {
    @Override
    public String makeIcecream() {
        return "Vanilla Ice Cream";
    }

    @Override
    public double cost() {
        return 1.75;
    }
}
