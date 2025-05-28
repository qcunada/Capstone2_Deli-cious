package SandwichShop;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {
    public static void generate(Order order){
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a"));

        try (FileWriter writer = new FileWriter("receipt.txt",true)) {
            writer.write("\n------------------------\n" +timeStamp + "\n" + order.getOrderDetails() + "\n" +  String.format("Tip: $%.2f\n" , order.getTip()) + String.format("Total: $%.2f\n",order.getTotal()) + "------------------------");
        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

}
