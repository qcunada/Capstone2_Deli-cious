package SandwichShop;

public class Drink implements MenuItem{
    private String name;
    private String size;

    public Drink(String name, String size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public double getPrice() {
        return switch (size.toLowerCase()){
            case "small" -> 2.00;
            case "medium" -> 2.50;
            case "large" -> 3.00;
            default -> 0;
        };
    }

    @Override
    public String getDescription() {
        return "Drink: " + name + " |  $" + getPrice();
    }


}
