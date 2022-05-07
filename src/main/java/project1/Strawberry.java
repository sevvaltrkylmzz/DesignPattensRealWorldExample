package project1;

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
