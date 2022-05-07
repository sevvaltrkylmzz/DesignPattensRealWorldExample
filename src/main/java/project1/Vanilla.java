package project1;

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
