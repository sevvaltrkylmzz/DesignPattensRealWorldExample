package project3;

public class Subscriber implements Observer{
   private String name;
    public Subscriber(String name, Subject subject) {
       this.name=name;
       subject.register(this);
   }
    @Override
    public void update(String availability) {
        System.out.println("Hello "+name+ " Product is now "+availability+" on our store!");
    }

}
