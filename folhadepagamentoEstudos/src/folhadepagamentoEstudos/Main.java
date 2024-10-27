package folhadepagamentoEstudos;

import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		
		System.out.println("Name:");
		employee.name = sc.nextLine();
		System.out.println("Gross:");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax:");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee: " + employee);
		
		System.out.println("Which percentage to increase salary: ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data: " + employee);

	}

}
