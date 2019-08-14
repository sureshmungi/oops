package capgemini.oops;

class Circle {
	// field...
	float radius;

	// constructor...
	public Circle() {
		radius = 1.0f;
		System.out.println("circle->def");
	}

	// constructor overloading...
	public Circle(float pradius) {
		radius = pradius;
		System.out.println("Circle->patrameter...");
	}

	// methods...
	public void draw() {
		System.out.println("circle is drawn...");
	}

	public double calcArea() {
		return radius * radius * Math.PI;
	}

	// method overriding from parent Object class
	@Override // java annotation
	public String toString() {
		return "Radius:" + radius;
		
	}
}

public class Circle_Test {
	public static void main(String[] args) {
		// Declaration...
		Circle c1, c2;
		// Object instantiation
		c1 = new Circle();
		c2 = new Circle(5.5f);
		// calling instance methods...
		c1.draw();
		System.out.println("c1 Area:" + c1.calcArea());
		c2.draw();
		System.out.println("c2 Area:" + c2.calcArea());
		System.out.println(c1);
		System.out.println(c2.toString());
	}

}
