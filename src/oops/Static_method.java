package oops;

public class Static_method {
	
	
	static int x=89;// stastic variable
	int y=9;//non stastic variable
	
	static void m1() {//ststic method
		System.out.println("this is static mathod");
	} 
	
	void m2() {//non static method
		System.out.println("this is non-static mathod");
	}

	void m3() {//non stastic ,method
		System.out.println("m3 emthod_ non stastic");
		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
	}
	
	public static void main(String[] args) {
		
		System.out.println(Static_method.x);//for static variable and method no need to create obj,can print directly
		Static_method.m1();//staic method
		
		//System.out.println(y);incorrect bcoz y is non-staic veriable
		//m2();m2 is non -stastic method
		
		Static_method st=new Static_method();//for non stitic variable and method need to create object
		System.out.println(st.y);
		st.m2();
		st.m3();
		
		
	}

}
