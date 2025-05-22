package SandwichShop;

public class Topping {
    private String name;
    private boolean isExtra;
    private String type;

    public Topping(String type, boolean isExtra, String name) {
        this.type = type;
        this.isExtra = isExtra;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
