package SandwichShop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<MenuItem> items = new ArrayList<>();

    public void addItem (MenuItem item){
        items.add(item);
    }

    public double getTotal(){
        double total = 0;
        for (MenuItem item : items){
            total += item.getPrice();
        }
        return total;

    }
    public String getOrderDetails(){
        StringBuilder sb = new StringBuilder();
        for (MenuItem item: items){
            sb.append(item.getDescription()).append('\n');
        }
        sb.append(String.format("\nTotal: $%.2f", getTotal()));
        return sb.toString();
    }
}
