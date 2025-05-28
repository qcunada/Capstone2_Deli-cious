package SandwichShop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();
    private double tip = 0.0;

    public double getTip() {
        return tip;
    }

    public void setTip(double tip) {
        this.tip = tip;
    }

    public void addItem (MenuItem item){
        items.add(item);
    }

    public double getSubtotal(){
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public double getTotal(){

        return getSubtotal() + tip;

    }
    public String getOrderDetails(){
        StringBuilder sb = new StringBuilder();
        for (MenuItem item: items){
            sb.append(item.getDescription()).append('\n');
        }

        sb.append(String.format( "\nSubtotal: $%.2f", getSubtotal()));

        return sb.toString();
    }
}
