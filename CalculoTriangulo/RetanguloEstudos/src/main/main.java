package main;

import java.util.Scanner;
import functions.Menu;
import packages.Rectangle;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Rectangle rectangle = new Rectangle();
        boolean end = false;

        while(!end) {
            System.out.println("Enter a value for the base of the rectangle:");
            rectangle.width = sc.nextDouble();
            System.out.println("Enter a value for the height of the rectangle:");
            rectangle.height = sc.nextDouble();
            menu.showMainMenu();
            int choice = sc.nextInt();
            
            if(choice == 1) {
                double areaResult = rectangle.area();
                System.out.printf("The area result is: %.2f\n", areaResult);
            } else if (choice == 2) {
                double perimeterResult = rectangle.perimeter();
                System.out.printf("The perimeter result is: %.2f\n", perimeterResult);
            } else if (choice == 3) {
                double diagonalResult = rectangle.diagonal();
                System.out.printf("The diagonal result is: %.2f\n", diagonalResult);
            } else if (choice == 4) {
                System.out.println("Thank you for using our software!");
                end = true;
            } else {
                System.out.println("Invalid option, please try again.");
            }    
        }
        sc.close();
    }
}
