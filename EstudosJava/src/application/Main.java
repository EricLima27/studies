package application;

import java.util.Scanner;

import entities.Product;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product product = new Product();
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            product.showMenuChoice();
            choice = sc.nextInt();
            System.out.println();
            sc.nextLine();
            
            if (choice == 1) {
                product.showMenuData(product.name, product.price, product.quantity);
            } else if (choice == 2) {
                System.out.println(product);
            } else if (choice == 3) {
                System.out.println("Coloque a quantidade que deseja adicionar: ");
                int quantity = sc.nextInt();
                product.addProducts(quantity);
            } else if (choice == 4) {
                System.out.println("Coloque a quantidade que deseja remover: ");
                int quantity = sc.nextInt();
                product.removeProducts(quantity);
            } else if (choice == 5) {
                System.out.println("Programa finalizado.");
                isRunning = false;
            } else {
            	System.out.println("Opção inválida.");
            }
        }
        sc.close();
    }
}