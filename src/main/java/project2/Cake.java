package project2;

import java.util.ArrayList;

public abstract class Cake {

    protected String name;
    protected int numLayers;
    protected ArrayList<String> decorations;
    protected String flavor;
    protected String icing;

    public Cake() {
        decorations = new ArrayList<String>();
    }
    public void makeCake() {
        createLayers();
        frostCake();
        addDecorations();
    }

    private void createLayers() {
        System.out.println("Creating a " + this.numLayers + " layered " + this.flavor + " cake");
    }

    private void frostCake() {
        System.out.println("Frost cake with " + this.icing + " icing");
    }

    private void addDecorations() {
        System.out.print("Adding ");
        for(int i = 0; i < decorations.size(); i++) {
            if(i == decorations.size() - 1){
                System.out.print(this.decorations.get(i) + " ");
            }else{
                System.out.print(this.decorations.get(i) + ", ");
            }

        }
        System.out.println();
    }
}
