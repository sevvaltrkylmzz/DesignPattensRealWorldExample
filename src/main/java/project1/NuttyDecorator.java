package project1;

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
