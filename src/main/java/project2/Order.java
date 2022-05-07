package project2;

public class Order implements Command {
    private Chef chef;
    private String foodType;
    private String foodName;


    public Order(Chef chef, String foodType, String foodName) {
        this.chef = chef;
        this.foodType = foodType;
        this.foodName = foodName;
    }

    public String getOrderName(){
        return this.foodName;
    }

    @Override
    public void execute() {
        if (this.foodType.equals("cookie")) {
            this.chef.bakeCookie(foodName);
        }else if (this.foodType.equals("cake")) {
            this.chef.bakeCake(foodName);
        }
        else {
            System.out.println("We don't have " + this.foodType + ".");
        }
    }
}
