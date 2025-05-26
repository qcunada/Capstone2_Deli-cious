package SandwichShop;

import java.util.ArrayList;
import java.util.List;

public class Sandwich implements MenuItem {
    private int size;
    private String bread;
    private String sauce;
    private boolean toasted;
    private List<Topping> toppings = new ArrayList<>();

    public Sandwich(int size, String bread, String sauce, boolean toasted) {
        this.size = size;
        this.bread = bread;
        this.sauce = sauce;
        this.toasted = toasted;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public void addTopping(Topping topping){
        toppings.add(topping);
    }


    @Override
    public double getPrice() {
       double price = switch (size){
            case 4 -> 5.50;
            case 8 -> 7.00;
            case 12 -> 8.50;
            default -> 0;
        };

        for (Topping t: toppings){
            price += t.getPrice(size) ;
        }
        return price;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
