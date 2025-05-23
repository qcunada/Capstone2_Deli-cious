package SandwichShop;

import java.util.Scanner;



public class UserInterface {
    static Scanner scanner = new Scanner(System.in);
    private Order currentOrder;

    public void startScreen() {
        while (true) {
            System.out.println("\n\uD83E\uDD6AWelcome to the DELI-cious Sandwich Shop! \uD83E\uDD6A\n" + "       -How can we help you today?-");
            System.out.println("       [1] Create new Order");
            System.out.println("       [0] Exit");
            System.out.println("   Choose an option: ");


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
            System.out.println("    [1] Create my own Sandwich");
            System.out.println("    [2] Add Drink");
            System.out.println("    [3] Add Chips");
            System.out.println("    [4] Checkout");
            System.out.println("    [0] Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> addSandwich();
//                    case 2 -> addDrink();
//                    case 3 -> addChips();
//                    case 4 -> checkout();
                case 0 -> {
                    System.out.println("\nOrder Cancelled. Taking you back to the main menu screen.");
                    return;
                }
                default -> System.out.println("\nInvalid option. Try again.\n");

            }
        }

    }

    public void addSandwich() {

        //asking the user which type of bread they want
        String bread = "";
        while (true) {

            System.out.println("What type of bread do you want for your sandwich? \uD83C\uDF5E");
            System.out.println("Choices include : White | Wheat | Rye | Wrap");
            System.out.println("Bread choice: ");
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
            System.out.println("Choices include: 4inches $5.50 | 8inches $7.00 | 12inches $8.50");
            System.out.println("Size choice ,[4,8 or 12]: ");

            String input = scanner.nextLine().trim();

            if (input.equals("4") || input.equals("8") || input.equals("12")) {
                size = Integer.parseInt(input); // safe to parse
                break;
            } else {
                System.out.println("\n ** Invalid size. Please enter exactly 4, 8, or 12. ** \n");
            }
        }

        String sauce = "";
        while (true) {
            System.out.println("\nChoose a sauce for your sandwich \uD83E\uDD6B");
            System.out.println("Choices include: Mayo | Mustard | Ketchup | Ranch | Thousand Islands | Vinaigrette ");
            System.out.println("Sauce choice: ");
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
            System.out.print("\nType 'add more' to add more toppings or type 'done' to finish: ");
            String next = scanner.nextLine().trim().toLowerCase();
            if (next.equals("done")) {
                System.out.println(" Finished adding toppings.");
                break;

            }
        }
    }
}

