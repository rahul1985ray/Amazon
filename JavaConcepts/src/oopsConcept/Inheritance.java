package oopsConcept;

public class Inheritance extends FirstClass {

	public static void main(String[] args) {

		FirstClass obj = new FirstClass();
		obj.method1();

		obj.method2();
		System.out.println(obj.method2());

		System.out.println(obj.b + obj.c);

	}

}
