package SandwichShop;

public class PremiumTopping extends Topping {
    private boolean isExtra;
    private String type;

    public PremiumTopping(String name, boolean isExtra, String type) {
        super(name);
        this.isExtra = isExtra;
        this.type = type;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public String getType() {
        return type;
    }

    @Override
    public double getPrice(int sandwichSize) {
        double basePrice = 0;

        if (type.equalsIgnoreCase("meat")){
            basePrice = switch (sandwichSize) {
                case 4 -> 1.00;
                case 8 -> 2.00;
                case 12 -> 3.00;
                default -> 0;
            };
            if (isExtra) basePrice= switch (sandwichSize) {
                case 4 -> 1.50;
                case 8 -> 3.00;
                case 12 -> 4.50;
                default -> 0;
            };



        } else if (type.equalsIgnoreCase("cheese")) {
            basePrice = switch (sandwichSize){
                case 4 -> 0.75;
                case 8 -> 1.50;
                case 12 -> 2.25;
                default -> 0;
            };
            if (isExtra) basePrice = switch (sandwichSize) {
                case 4 -> 1.05;
                case 8 -> 2.10;
                case 12 -> 3.15;
                default -> 0;
            };
        }


        return basePrice;
    }

    @Override
    public String getDescription() {
        return getName() + (isExtra ? " (extra)" : "");
    }
}
