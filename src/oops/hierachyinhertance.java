package oops;


class parent{
	int a;
	
	void dispaly() {
		System.out.println(a);
	}
}

class child1 extends parent{
	int b;
	
	void print() {
		System.out.println(b);
	}
}
class child2 extends parent{
	int c;
	
	void print() {
		System.out.println(c);
	}
}

public class hierachyinhertance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child1 obj =new child1();
		obj.a=100;
		obj.dispaly();
		obj.b=78;
		obj.print();
		
		child2 obj1 =new child2();
		obj1.a=34 ;
		obj1.dispaly();
		obj1.c=67;
		obj1.print();
		
	}

}
