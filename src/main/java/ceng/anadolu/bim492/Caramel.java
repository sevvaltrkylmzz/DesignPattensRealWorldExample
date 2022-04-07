package ceng.anadolu.bim492;

public class Caramel implements Icecream {
    @Override
    public String makeIcecream() {
        return "Caramel Ice Cream";
    }

    @Override
    public double cost() {
        return 2.25;
    }
}
