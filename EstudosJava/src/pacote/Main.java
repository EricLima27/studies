package pacote;

import java.util.Scanner;

import entidades.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo x,y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite o 1º valor de X: ");
		x.a = sc.nextDouble();
		System.out.println("Digite o 2º valor de X: ");
		x.b = sc.nextDouble();
		System.out.println("Digite o 3º valor de X: ");
		x.c = sc.nextDouble();
		System.out.println("Digite o 1º valor de Y: ");
		y.a = sc.nextDouble();
		System.out.println("Digite o 2º valor de Y: ");
		y.b = sc.nextDouble();
		System.out.println("Digite o 3º valor de Y: ");
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();

		System.out.printf("A área do triangulo X é: %f\n", areaX);
		System.out.printf("E a área do triangulo Y é: %f", areaY);
		
		
	}

}
