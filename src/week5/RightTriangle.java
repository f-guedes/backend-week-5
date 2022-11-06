package week5;

public class RightTriangle {	
	private double base;
	private double height;
	private double area;
	private double hypotenuse;
	private double perimeter;
	
	public RightTriangle (double base, double height) {
		this.base = base ;
		this.height = height;
		this.area = (base * height) / 2;
		this.hypotenuse = Math.sqrt((base * base) + (height * height));
		this.perimeter = base + height + hypotenuse;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
		this.area = (base * height) / 2;
		this.hypotenuse = Math.sqrt((base * base) + (height * height)); 
		this.perimeter = base + height + hypotenuse;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
		this.area = base * height;
		this.hypotenuse = Math.sqrt((base * base) + (height * height)); 
		this.perimeter = base + height + hypotenuse;
	}

	public double getArea() {
		return area;
	}
	
	public double getHypotenuse() {
		return hypotenuse;
	}

	public void setHypotenuse(double hypotenuse) {
		this.hypotenuse = hypotenuse;
		this.base = Math.sqrt((hypotenuse * hypotenuse) - height * height);
		this.height = Math.sqrt((hypotenuse * hypotenuse) - base * base);
		this.area = (base * height) / 2;
		this.perimeter = base + height + hypotenuse;
		
	}

	public double getPerimeter() {
		return perimeter;
	}

}
