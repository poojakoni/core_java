package oops;

public class MethodOverlaoding {
	// creating methods in class
	
	//method overloading example: method is same but parameter should be diffrent
	
		void add(int a, int b) {//case1
			
			System.out.println(a+b);
		}
		
       void add(int a, double b) {//case2
			
			System.out.println(a+b);
		}
       void add(double a, double b) {//case3
			
			System.out.println(a+b);
		}
       void add(int a, int b ,int c) {//case 4
			
			System.out.println(a+b+c);
		}
		
       //constructor overloading 
       
    /*   MethodOverlaoding(int a,int b){//case1
    	   System.out.println(a+b);
       }
       
       MethodOverlaoding(double a,int b){//case2
    	   System.out.println(a+b);
       }
       MethodOverlaoding(int a,int b,int c){//case4
    	   System.out.println(a+b+c);
       }
       MethodOverlaoding(double a,double b){//case3
    	   System.out.println(a+b);
       }*/
       
       // overlaoding mainmethod
       
       public void main(int q) {//created main methods in class
    	   System.out.println("print q" + q);
       } 
       
       public void main(int q ,int d) {
    	   System.out.println("sum "+(q+d));
       }
       
     //main method
		public static void main(String[] args) {
			
			
			// method overloading
			
			/*MethodOverlaoding mo=new MethodOverlaoding();//creating object
			mo.add(20.2, 12.3);//3
			mo.add(20,5.5);//2
			mo.add(5, 5);//1
			mo.add(8, 8, 9);//4*/
			
			
			  //constructor overloading 
			/*MethodOverlaoding mo=new MethodOverlaoding(10,20);
			MethodOverlaoding mo1=new MethodOverlaoding(10,20,30);
			MethodOverlaoding mo2=new MethodOverlaoding(10.5,20);
			MethodOverlaoding mo3=new MethodOverlaoding(10.9,20.4);*/
			
			
			 // overlaoding mainmethod
			MethodOverlaoding moo=new MethodOverlaoding();
			moo.main(100);
			
			MethodOverlaoding m1o=new MethodOverlaoding();
			m1o.main(12, 23);
	}

}
