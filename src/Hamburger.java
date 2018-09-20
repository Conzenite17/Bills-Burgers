import java.util.ArrayList;

public class Hamburger {
    private String breadType;
    private String meatType;
    private double price;
    private ArrayList<String> additions;

    public Hamburger(String breadType, String meatType, double price) {
        this.breadType = breadType;
        this.meatType = meatType;
        this.price = price;
        this.additions = new ArrayList<String>();
    }

    public void addAddition(String name, double price){
        if (this.additions.size() < 5){
            this.additions.add(name);
            this.price += price;
        } else {
            System.out.println("No more than 4 additions for a basic burger :)");
        }
    }

    public String getBreadType() {
        return breadType;
    }

    public String getMeatType() {
        return meatType;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<String> getAdditions() {
        return additions;
    }
}