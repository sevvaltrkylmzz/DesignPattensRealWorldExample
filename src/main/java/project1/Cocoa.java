package project1;

public class Cocoa implements Icecream {
    @Override
    public String makeIcecream() {

        return "Cocoa Ice Cream";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
