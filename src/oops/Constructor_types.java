package oops;

public class Constructor_types {
 int x;//in constuctor only intilizing 
 int y;
 
 
 Constructor_types(){//default constructor or not taking any parameters.
	 
	 x=10;//intilizing value
	 y=20;
	  }

 Constructor_types(int a, int b){//parameter constructor
	 x=a;//intilizing paremeters like a
	 y=b;
	 
	 
 }	
 void display() {
	 
	 System.out.println(x+y);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_types cm1= new Constructor_types();//case1, creating object
		cm1.display();
		
		Constructor_types cm2= new Constructor_types(100,200);//case2
		cm2.display();
	}

}
