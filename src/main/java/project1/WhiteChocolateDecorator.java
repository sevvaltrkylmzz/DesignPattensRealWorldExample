package project1;

public class WhiteChocolateDecorator extends IcecreamDecorator{

    public WhiteChocolateDecorator(Icecream specialIcecream) {
        super(specialIcecream);
    }

    public String makeIcecream() {
        return specialIcecream.makeIcecream() + addWhiteChocolate() ;
    }

    private String addWhiteChocolate() {
        return " + white chocolate ";
    }

    public double cost() {
        return 0.35 + specialIcecream.cost();
    }
}
