package project2;

public class Client {
    public static void main(String[] args) {

        Chef chef = new Chef();

        Order order = new Order(chef, "cake", "black forest cake");
        Waiter waiter = new Waiter(order);
        waiter.execute();

        order = new Order(chef,"cookie","ginger bread cookie" );
        waiter = new Waiter(order);
        waiter.execute();

        order = new Order(chef,"cookie","chocolate chip cookie" );
        waiter = new Waiter(order);
        waiter.execute();

        order = new Order(chef,"cupcake","strawberry cheesecake" );
        waiter = new Waiter(order);
        waiter.execute();

        order = new Order(chef,"cookie","macaroon" );
        waiter = new Waiter(order);
        waiter.execute();

    }
}
