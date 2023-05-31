package org.example;
import java.util.Scanner;

public class HomeScreen {
    public void display() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(ColorCodes.ANSI_PINK +"\n=*=*=*=*=*=*=*=*=*=*=*=*=* Welcome to DELI-cious! *=*=*=*=*=*=*=*=*=*=*=*=*=* \n"+ColorCodes.ANSI_RESET);
            System.out.println(ColorCodes.TEXT_BLUE+"1) Place a New Order");

            System.out.println("0) Exit"+ColorCodes.ANSI_RESET);
            System.out.print(ColorCodes.ANSI_YELLOW+"\nEnter your choice: "+ColorCodes.ANSI_RESET);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Order order = new Order();
                    OrderScreen orderScreen = new OrderScreen(order);
                    orderScreen.display();
                    break;
                case 0:
                    System.out.println(ColorCodes.TEXT_RED+"Exiting the application... Goodbye!"+ColorCodes.ANSI_RESET);
                    return;
                default:
                    System.out.println(ColorCodes.TEXT_RED+"Invalid choice. Please try again."+ColorCodes.ANSI_RESET);
            }
        }
    }
}
