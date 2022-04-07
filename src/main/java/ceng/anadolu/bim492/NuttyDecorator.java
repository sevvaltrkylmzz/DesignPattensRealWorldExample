package ceng.anadolu.bim492;

import ceng.anadolu.bim492.Icecream;
import ceng.anadolu.bim492.IcecreamDecorator;

public class NuttyDecorator extends IcecreamDecorator {

    public NuttyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addNuts() ;
    }

    private String addNuts() {
        return " + cruncy nuts ";
    }

    public double cost() {
        return 0.20 + specialIcecream.cost();
    }

}
