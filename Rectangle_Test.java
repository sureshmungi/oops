package capgemini.oops;

class Rectangle {
	// field
	float bred;
	float leng;

	// constructor...
	public Rectangle() {
		leng = 9.2f;
		bred = 8.6f;
		System.out.println("rectangle->def");
	}

	// constructor overloading...
	public Rectangle(float pleng, float pbred) {
		leng = pleng;
		bred = pbred;

		System.out.println("Rectangle->patrameter...");
	}

	// methods...
	public void draw() {
		System.out.println("Rectangle is drawn...");
	}

	public double calcArea() {
		return leng * bred;
	}

	// method overriding from parent Object class
	@Override
	public boolean equals(Object obj) {
		System.out.println("Rectangle_Test...");
		Rectangle otherRectangle = (Rectangle) obj;
		if (this.leng == otherRectangle.leng && this.bred == otherRectangle.bred) {
			return true;
		} else {
			return false;
		}
	}
}

public class Rectangle_Test {
	public static void main(String[] args) {
		// declaration
		Rectangle r2;
		// instantiation
		Rectangle r1 = new Rectangle();
		r2 = new Rectangle(5.0f, 6.5f);
		// calling instance methods
		r1.draw();
		System.out.println("R1 area:" + r1.calcArea());
		r2.draw();
		System.out.println("R2 area:" + r2.calcArea());
		System.out.println(r1);
		System.out.println(r1.toString());
	}

}
