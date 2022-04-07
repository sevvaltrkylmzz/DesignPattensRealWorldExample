package ceng.anadolu.bim492;

public class SprinklesDecorator extends IcecreamDecorator{

    public SprinklesDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addSprinkles() ;
    }

    private String addSprinkles() {
        return " + sprinkles ";
    }

    public double cost() {
        return 0.10 + specialIcecream.cost();
    }

}
