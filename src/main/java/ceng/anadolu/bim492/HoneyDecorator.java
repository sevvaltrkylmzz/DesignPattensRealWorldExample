package ceng.anadolu.bim492;

public class HoneyDecorator extends IcecreamDecorator {

    public HoneyDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addHoney() ;
    }

    private String addHoney() {
        return " + sweet honey ";
    }

    public double cost() {
        return 0.25 + specialIcecream.cost();
    }
}
