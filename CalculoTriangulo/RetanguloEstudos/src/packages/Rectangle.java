package packages;

public class Rectangle {
	public double width;
	public double height;

	public double area() {
		double areaRectangle = this.width * this.height;
		return areaRectangle;
	}
	public double perimeter() {
		double perimeterRectangle = 2 * (this.width + this.height);
		return perimeterRectangle;
	}
	public double diagonal() {
		double diagonalRectangle = Math.sqrt((Math.pow(width, 2)) + (Math.pow(height, 2)));
		return diagonalRectangle;
	}
}
