package SandwichShop;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptGenerator {
    public static void generate(Order order){
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy hh:mm a"));

        try (FileWriter writer = new FileWriter("receipt.txt",true)) {
            writer.write("------------------------\n" +timeStamp + "\n" + order.getOrderDetails() + "\n------------------------\n");
        } catch (IOException e) {
            System.out.println("Error writing receipt: " + e.getMessage());
        }
    }

}
