package project2;

import java.util.ArrayList;

public abstract class Cookie {

    protected String name;
    protected String shape;
    protected ArrayList<String> flavors;

    public Cookie() {
        flavors = new ArrayList<String>();
    }

    public void makeCookie() {
        makeCookieDough();
        addFlavors();
        giveShape();
    }

    private void makeCookieDough() {
        System.out.println("Cookie's dough is being made.");
    }

    private void addFlavors() {
        System.out.print("Adding ");
        for (int i = 0; i < flavors.size(); i++) {
            if (i == flavors.size() - 1) {
                System.out.print(this.flavors.get(i) + " ");
            }else{
                System.out.print(this.flavors.get(i) + ", ");
            }
        }
        System.out.println("to the cookie dough.");

    }

    private void giveShape() {
        System.out.println(this.shape + " shape is giving.");
    }


}
