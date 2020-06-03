package oopsConcept;

public class FirstClass {
	String b = "rahul";
	String c = "ray";

	public static void main(String[] args) {

		System.out.println("main method needs to be present for execution of program");
		System.out.println("no line added");

		FirstClass object = new FirstClass();

		int a = 10;
		int c = 20;
		int d = a + c;
		System.out.println(d); // calculation inside class

		object.method1();
		System.out.println(); // calling sum of method1

		object.method2();
		System.out.println(object.method2()); // calling sum of method2

		System.out.println(object.b + object.c); // calling global variable outside main class

	}

	public void method1() {
		int e = 15;
		int f = 25;
		int g = e + f;
		System.out.println(g);

	}

	public double method2() {
		double a = 20.25;
		double b = 50.33;
		double c = a + b;
		return c;
	}
}
