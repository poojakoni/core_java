package oops;

public class ThisKeyword {

	int a,b;//instence variable or class variables
	
	void getvalue(int a, int b) {//method variables / extrenal variables(intence and external variables same that time we use this)
			
		this.a=a;
		this.b=b;
	}
	
	void printvalue() {
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisKeyword th=new ThisKeyword();
		th.getvalue(12,23);
		th.printvalue();
		
	}

}
