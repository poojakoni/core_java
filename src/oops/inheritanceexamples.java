package oops;

class A {
	int a;

	void display() {
		System.out.println(a);
	}
}

class B extends A {
	int b;

	void print() {
		System.out.println(b);
	}
}

class C extends B {
	int c;

	void show() {
		System.out.println(a + b + c);
	}
}

public class inheritanceexamples {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*A a1 = new A();
		a1.a = 100;
		a1.display();

		B a2 = new B();
		a2.a = 90;
		a2.b = 78;
		a2.display();*/

		C a3 = new C();
		a3.c = 23;
		a3.a = 8;
		a3.b = 67;
		a3.display();
		a3.print();
		a3.show();
		
	}

}
