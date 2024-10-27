package entities;

public class Employee {
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		double decrement = this.grossSalary - this.tax;
		return decrement;
	}
	public void increaseSalary(double percentage) {
		double valuePercentage = this.grossSalary * (percentage/100);
		this.grossSalary += valuePercentage;
	}
	public String toString() {
		return name + ", $ " + String.format("%.2f",netSalary());
	}
}
