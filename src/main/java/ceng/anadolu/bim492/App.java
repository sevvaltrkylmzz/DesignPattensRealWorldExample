package ceng.anadolu.bim492;

public class App {
    public static void main(String[] args) {

        ShoppingCart user1 = new ShoppingCart();

        Icecream item1 = new Vanilla();
        item1= new NuttyDecorator(item1);
        item1= new SprinklesDecorator(item1);
        Icecream item2 = new Strawberry();
        item2 = new HoneyDecorator(item2);
        item2 = new HoneyDecorator(item2);
        Icecream item3 = new Cocoa();
        item3 =new WhiteChocolateDecorator(item3);

        user1.addItem(item1);
        user1.addItem(item2);
        user1.addItem(item3);

        //pay by paypal
        user1.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        System.out.println("----------------------------------------------------");

        ShoppingCart user2 = new ShoppingCart();

        Icecream item4 = new Vanilla();
        item4= new NuttyDecorator(item4);
        item4= new NuttyDecorator(item4);
        item4 = new WhiteChocolateDecorator(item4);
        Icecream item5 = new Strawberry();
        item5 = new HoneyDecorator(item5);
        item5 = new SprinklesDecorator(item5);
        Icecream item6 = new Caramel();
        item6 =new WhiteChocolateDecorator(item6);
        Icecream item7= new Cocoa();

        user2.addItem(item4);
        user2.addItem(item5);
        user2.addItem(item6);

        //pay by credit card
        user2.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));

    }
}
