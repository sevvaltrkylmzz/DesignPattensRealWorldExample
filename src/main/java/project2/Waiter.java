package project2;

public class Waiter {
    private Order order;

    public Waiter(Order ord) {
        this.order = ord;
    }

    public void execute() {
        System.out.println();
        System.out.println("Order of " + order.getOrderName() + " has been taken.");
        this.order.execute();
    }

}
