package SandwichShop;

public class PremiumTopping extends Topping {
    private boolean isExtra;
    private String type;

    public PremiumTopping(String name, boolean isExtra, String type) {
        super(name);
        this.isExtra = isExtra;
        this.type = type;
    }

    @Override
    public double getPrice(int sandwichSize) {
        return 0;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
