package SandwichShop;

public class Chips implements MenuItem {
    private String name;

    public Chips(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return 1.50;
    }

    @Override
    public String getDescription() {
        return "Chips: " + name + " | $" + String.format("%.2f",getPrice());
    }
}
