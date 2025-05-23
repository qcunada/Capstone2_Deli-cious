package SandwichShop;

public class RegularTopping extends Topping {

    public RegularTopping(String name) {
        super(name);
    }

    @Override
    public double getPrice(int sandwichSize) {
        return 0.0;
    }

    @Override
    public String getDescription() {
        return getName();
    }
}
