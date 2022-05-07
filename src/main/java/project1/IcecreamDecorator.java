package project1;

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
