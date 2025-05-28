package SandwichShop;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public void startScreen() {
        while (true) {
            System.out.println("\n\uD83E\uDD6AWelcome to the * Bread & Butter * Sandwich Shop! \uD83E\uDD6A\n" + "       -How can we help you today?-");
            System.out.println("       [1] Create new Order");
            System.out.println("       [0] Exit");
            System.out.print("   Choose an option: ");


            try {
                int option = scanner.nextInt();

                switch (option) {
                    case 1 -> newOrder();
                    case 0 -> {
                        System.out.println("Thank you for using the app, See you next time!");
                        return;
                    }
                    default -> System.out.println("Invalid choice. Please try again.");
                }

            } catch (Exception e) {
                System.out.println("Invalid choice. Please try again.");
                scanner.nextLine();
            }
        }
    }

    public void newOrder() {
        currentOrder = new Order();

        while (true) {
            System.out.println("\n     ======= ORDER MENU ======= \n What can I get you for your order?");
            System.out.println("    [1] \uD83E\uDD6A Choose my own Sandwich ");
            System.out.println("    [2] ⚙\uFE0F Build my own Sandwich ");
            System.out.println("    [3] \uD83E\uDD64 Add Drink  ");
            System.out.println("    [4] \uD83E\uDD54 Add Chips ");
            System.out.println("    [5] \uD83E\uDDFE Checkout ");
            System.out.println("    [0] \uD83D\uDE80 Exit ");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> chooseSandwich();
                case 2 -> addSandwich();
                case 3 -> addDrink();
                case 4 -> addChips();
                case 5 -> checkOut();
                case 0 -> {
                    System.out.println("\nOrder Cancelled. Taking you back to the main menu screen.");
                    return;
                }
                default -> System.out.println("\nInvalid option. Try again.\n");

            }
        }

    }
    public void chooseSandwich(){
        System.out.println("\n=== Choose your Sandwich! ===\n");
        System.out.println("[1] The Classic \uD83E\uDDC0 | $8.50   \n8\" white, ham, cheddar, lettuce, tomato, mayo\n ");
        System.out.println("[2] The Veggie Wrap \uD83E\uDD6C | $10.75   \n12\" wrap, provolone, pickles, jalapenos, vinaigrette\n ");
        System.out.println("[3] The Meat Lover \uD83E\uDD69 | $22.75  \n12\" rye, steak, ham, roast beef, cheddar, bacon, mustard\n  ");
        System.out.println("Choose your selected sandwich [1-3]: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        Sandwich sandwich = null;

        switch (choice) {
            case 1 -> {
                sandwich = new Sandwich(8,"white","mayo", false,"The Classic");
                sandwich.addTopping(new PremiumTopping("cheddar",false,"cheese"));
                sandwich.addTopping(new RegularTopping("lettuce"));
                sandwich.addTopping(new RegularTopping("tomato"));
            }
            case 2 -> {
                sandwich = new Sandwich(12,"wrap", "vinaigrette",false,"The Veggie Wrap");
                sandwich.addTopping(new PremiumTopping("provolone", false, "cheese"));
                sandwich.addTopping(new RegularTopping("pickles"));
                sandwich.addTopping(new RegularTopping("jalapenos"));
            }
            case 3 -> {
                sandwich = new Sandwich(12,"rye","mustard",true,"The Meat Lover");
                sandwich.addTopping(new PremiumTopping("steak",false,"meat"));
                sandwich.addTopping(new PremiumTopping("ham",false,"meat"));
                sandwich.addTopping(new PremiumTopping("roast beef",false,"meat"));
                sandwich.addTopping(new PremiumTopping("cheddar",false,"cheese"));
                sandwich.addTopping(new PremiumTopping("bacon",false,"meat"));
            }
            default -> System.out.println("Invalid selection. Select from choices 1 - 3");
        }
        if (sandwich != null) {
            currentOrder.addItem(sandwich);
            System.out.println("You selected '" + sandwich + "'.");
            System.out.println("Your sandwich has been added to the cart.");
        }

    }

    public void addSandwich() {

        //asking the user which type of bread they want
        String bread = "";
        while (true) {

            System.out.println("\nWhat type of bread do you want for your sandwich? \uD83C\uDF5E");
            System.out.println("Choices include : White | Wheat | Rye | Wrap");
            System.out.print("Bread choice: ");
            bread = scanner.nextLine().trim();

            //this makes sure that the input is included in the choices
            if (bread.equalsIgnoreCase("White") || bread.equalsIgnoreCase("Wheat") ||
                    bread.equalsIgnoreCase("Rye") || bread.equalsIgnoreCase("Wrap")) {
                break;
            } else {
                System.out.println("\n** Invalid bread choice. Please choose from the options provided. **\n");
            }
        }

        int size = 0;
        while (true) {
            System.out.println("\nWhat size of sandwich would you like? \uD83D\uDCCF");
            System.out.println("Choices include: 4\" $5.50 | 8\" $7.00 | 12\" $8.50");
            System.out.print("Size choice [4,8 or 12]: ");

            String input = scanner.nextLine().trim();

            if (input.equals("4") || input.equals("8") || input.equals("12")) {
                size = Integer.parseInt(input);

                break;
            } else {
                System.out.println("\n ** Invalid size. Please enter exactly 4, 8, or 12. ** \n");
            }
        }

        String sauce = "";
        while (true) {
            System.out.println("\nChoose a sauce for your sandwich \uD83E\uDD6B");
            System.out.println("Choices include: Mayo | Mustard | Ketchup | Ranch | Thousand Islands | Vinaigrette ");
            System.out.print("Sauce choice: ");
            sauce = scanner.nextLine().trim();

            if (sauce.equalsIgnoreCase("Mayo") ||
                    sauce.equalsIgnoreCase("Mustard") ||
                    sauce.equalsIgnoreCase("Ketchup") ||
                    sauce.equalsIgnoreCase("Ranch") ||
                    sauce.equalsIgnoreCase("Thousand Islands") ||
                    sauce.equalsIgnoreCase("Vinaigrette")) {
                break;
            } else {
                System.out.println("\n ** Invalid sauce. Please choose from the list provided. ** \n");
            }
        }


        System.out.println("\nDo you want your sandwich toasted? [Yes/No]: ");
        boolean isToasted = scanner.nextLine().equalsIgnoreCase("yes");

        Sandwich sandwich = new Sandwich(size, bread, sauce, isToasted);

        System.out.println("\nIt's time to add topping on your sandwich!");
        while (true) {
            System.out.println("\nChoose a topping type: Meat \uD83E\uDD69 | Cheese \uD83E\uDDC0 | Regular \uD83E\uDD6C \nType 'done' when your finish adding topping to your sandwich.");
            String type = scanner.nextLine().toLowerCase();
            if (type.equals("done")) {
                System.out.println("Finished added toppings!");
                break;
            }

            switch (type) {
                case "meat" -> {
                    System.out.println("\nAvailable meats: Steak | Ham | Salami | Roast Beef | Chicken | Bacon");
                    System.out.println("Added meat prices:\n 4inch $1.00 [extra + $0.50] \n 8inch $2.00 [extra + $1.00] \n 12inch $3.00 [extra + $1.50]");
                }
                case "cheese" -> {
                    System.out.println("\nAvailable cheeses: American | Provolone | Cheddar | Swiss | Mozzarella");
                    System.out.println("Added cheese prices:\n 4inch $0.75 [extra + $0.30] \n 8inch $1.50 [extra + $0.60] \n 12inch $2.25 [extra + $0.90]");
                }
                case "regular" -> {
                    System.out.println("\nAvailable regular toppings: Lettuce | Tomato | Onion | Pickles | Jalapenos");
                }
                default -> {
                    System.out.println("\n ** Invalid topping type. Try again. ** \n");
                    continue;
                }
            }
            String name = "";
            boolean validTopping = false;

            while (!validTopping) {
                System.out.println("\nTopping to add: ");
                name = scanner.nextLine().trim();

                switch (type) {
                    case "meat" -> {
                        if (name.equalsIgnoreCase("Steak") || name.equalsIgnoreCase("Ham") ||
                                name.equalsIgnoreCase("Salami") || name.equalsIgnoreCase("Roast Beef") ||
                                name.equalsIgnoreCase("Chicken") || name.equalsIgnoreCase("Bacon")) {
                            validTopping = true;
                        } else {
                            System.out.println("❌ Invalid meat. Please choose from -> Steak | Ham | Salami | Roast Beef | Chicken | Bacon");
                        }
                    }
                    case "cheese" -> {
                        if (name.equalsIgnoreCase("American") || name.equalsIgnoreCase("Provolone") ||
                                name.equalsIgnoreCase("Cheddar") || name.equalsIgnoreCase("Swiss") ||
                                name.equalsIgnoreCase("Mozzarella")) {
                            validTopping = true;
                        } else {
                            System.out.println("❌ Invalid cheese. Please choose from: American | Provolone | Cheddar | Swiss | Mozzarella");
                        }
                    }
                    case "regular" -> {
                        if (name.equalsIgnoreCase("Lettuce") || name.equalsIgnoreCase("Tomato") ||
                                name.equalsIgnoreCase("Onion") || name.equalsIgnoreCase("Pickles") ||
                                name.equalsIgnoreCase("Jalapenos")) {
                            validTopping = true;
                        } else {
                            System.out.println("❌ Invalid topping. Please choose from: Lettuce | Tomato | Onion | Pickles | Jalapenos");
                        }
                    }
                }
            }

            boolean extra = false;
            if (type.equals("meat") || type.equals("cheese")) {
                System.out.print("Extra? (yes/no): ");
                extra = scanner.nextLine().equalsIgnoreCase("yes");
            }

            Topping topping = (type.equals("meat") || type.equals("cheese"))
                    ? new PremiumTopping(name, extra, type)
                    : new RegularTopping(name);

            sandwich.addTopping(topping);
            System.out.println("\n✅ Added: " + name + (extra ? " (extra)" : ""));

            // Ask if they want to continue or finish
            System.out.print("\nPress 'enter' to add more toppings or type 'done' to finish: ");
            String next = scanner.nextLine().trim().toLowerCase();
            if (next.equals("done")) {
                System.out.println(" \nFinished adding toppings.");
                System.out.println("Sandwich added to the cart!");
                break;

            }


        }
        currentOrder.addItem(sandwich);
    }

    public void addDrink() {

        System.out.println("What Drink would you like?");
        System.out.println("\nClassic Cola \uD83E\uDD64\n" +
                "A refreshing carbonated soft drink served chilled.\n" +
                "\n" +
                "Iced Lemon Tea \uD83C\uDF4B\n" +
                "Black tea with a splash of lemon over ice—light and zesty.\n" +
                "\n" +
                "Bottled Water \uD83D\uDCA7\n" +
                "Pure, crisp bottled water to keep it simple and hydrating.\n" +
                "\n" +
                "Sparkling Berry Fizz \uD83C\uDF53\n" +
                "Fruity sparkling water with a mix of strawberry and raspberry flavors.\n" +
                "\n" +
                "Fresh Orange Juice \uD83C\uDF4A\n" +
                "100% squeezed orange juice—no added sugar, just sunshine.\n" +
                "\n" +
                "Cold Brew Coffee \uD83E\uDDCB\n" +
                "Smooth and bold cold brew made from freshly ground beans, served over ice.");


        System.out.println("\nDrink Choices: Cola | Tea | Water | Fizz | Orange | Coffee \nSmall 2.00 | Medium 2.50 | Large 3.00\n");

        Set<String> validChoices = new HashSet<>(Arrays.asList("cola", "tea" , "water", "fizz" , "orange", "coffee"));



        String name;
        while (true) {
            System.out.print("Enter Drink \uD83E\uDD64: ");
            name = scanner.nextLine().trim().toLowerCase();



            if (validChoices.contains(name)){

                System.out.println("\nYou selected " + name.toUpperCase() + ". Very Refreshing!\n ");
                break;
            }else {
                System.out.println("Invalid drink. Choose from: Cola | Tea | Water | Fizz | Orange | Coffee ");
            }

        }
        System.out.print("Enter Drink Size : ");
        String size = scanner.nextLine();


        currentOrder.addItem(new Drink(name,size));
        System.out.println("\nOne " + size + " "+ name + " added to your order! \uD83E\uDD64.");
    }
    public void addChips(){
        System.out.println("\nClassic Sea Salt Chips \uD83E\uDDC2\n" +
                "Crispy kettle-cooked chips with a pinch of sea salt.\n" +
                "\n" +
                "Barbecue Crunch Chips \uD83C\uDF56\n" +
                "Smoky, sweet, and tangy BBQ flavor with a bold crunch.\n" +
                "\n" +
                "Sour Cream & Onion Chips \uD83E\uDDC5\n" +
                "Creamy, tangy, and irresistibly savory.\n" +
                "\n" +
                "Spicy Jalapeño Chips \uD83C\uDF36\uFE0F\n" +
                "Zesty and hot with a satisfying heat kick.");

        System.out.println("\nClassic | BBQ | Onion | Jalapeno\n Price: 1.50");


        Set<String> validChoices = new HashSet<>(Arrays.asList("classic", "bbq" , "onion", "jalapeno"));

        String name;
        while (true) {
            System.out.println("Enter chip name of choice \uD83E\uDD54: ");
            name = scanner.nextLine().trim().toLowerCase();

            if (validChoices.contains(name)){
                System.out.println("\nYou selected " + name.toUpperCase() + " chips. Good Choice!");
                break;
            }else {
                System.out.println("Invalid item. Choose from: Classic | BBQ | Onion | Jalapeno ");
            }
        }
        currentOrder.addItem(new Chips(name));
        System.out.println("Chips added to the cart.");
    }
    public void checkOut(){
        System.out.println("\n--------Order Details--------");
        System.out.println(currentOrder.getOrderDetails());
        System.out.println("------------------------------");

        System.out.print("Confirm order? (yes/no): ");
        if (scanner.nextLine().equalsIgnoreCase("yes")) {
            ReceiptGenerator.generate(currentOrder);
            System.out.println("Order confirmed. Receipt saved.");
        } else {
            System.out.println("Order canceled.");
        }

        currentOrder = null;
    }

}

