package week5;

public class ShapesApp {

	public static void main(String[] args) {
		Rectangle shape1 = new Rectangle (11, 15);
//		System.out.println(shape1.getArea());
		
		RightTriangle shape2 = new RightTriangle(200, 15);
		System.out.printf("%.2f%n", shape2.getArea());
		System.out.printf("%.2f%n", shape2.getHypotenuse());
		System.out.printf("%.2f%n", shape2.getPerimeter());
		shape2.setHypotenuse(19);
		System.out.printf("%.2f%n", shape2.getBase());
		System.out.printf("%.2f%n", shape2.getHeight());		
		System.out.printf("%.2f%n", shape2.getArea());
		System.out.printf("%.2f%n", shape2.getPerimeter());
			
		
	}

}
