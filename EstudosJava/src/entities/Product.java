package entities;

import java.util.Scanner;

public class Product {
	Scanner sc = new Scanner(System.in);
	public String name;
	public double price;
	public int quantity;
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	public void addProducts(int quantity) {
		this.quantity += quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f",price) + ", " + quantity + " unidades, Total: $ " + String.format("%.2f",totalValueInStock());
	}
	 public void showMenuChoice() {
         System.out.println("Escolha a opção que você deseja acessar:");
         System.out.println("1. Preencher dados.");
         System.out.println("2. Mostrar dados.");
         System.out.println("3. Adicionar itens.");
         System.out.println("4. Remover itens.");
         System.out.println("5. Finalizar.");
         System.out.print("Sua opção:");
     }
	 public void showMenuData(String name, double price, int quantity) {
		   System.out.println("Coloque os dados do produto: ");
           System.out.print("Nome: ");
           this.name = sc.nextLine();
           System.out.print("Preço: ");
           this.price = sc.nextDouble();
           System.out.print("Quantidade em estoque: ");
           this.quantity = sc.nextInt();
           System.out.println();
	 }
 }
