package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Icecream;

public abstract class IcecreamDecorator implements Icecream {
    protected Icecream specialIcecream;

    public IcecreamDecorator(Icecream specialIcecream) {
        this.specialIcecream = specialIcecream;
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream();
    }

    public double cost(){
        return specialIcecream.cost();
    }
}
