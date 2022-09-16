package oops;

public class Student_1 {

	int SID;
	int mathsmarks;	
	int siencemarks;
	int englishmarks;
	
	 String Sname;// variables 
	
	
	 Student_1( int a, String name ){//passed parameter
		
		SID=a;
		Sname=name;
	}
	 Student_1(int x,int y,int z){
		 mathsmarks=x;
		 siencemarks=y;
		 englishmarks=z;
		 
		 }
	 
	
	void disply() {
		
			 System.out.println("student ID =" + SID   + "student name =" +Sname);}
	void disply1() {
			 System.out.println("marks in maths ="+mathsmarks);
			 System.out.println("marks in sience ="+siencemarks);
			 System.out.println("marks in english = "+englishmarks);}
	void disply2() {
			 System.out.println("total marks ="+( englishmarks + mathsmarks + siencemarks));	}
	
	
	public static void main(String[] args) {
		Student_1 stu=new Student_1(23,  "pooja");
		stu.disply();
		
		Student_1 stu1=new Student_1(20, 30, 40);
		stu1.disply1();
		
		Student_1 stu2=new Student_1(20,30,40);
		stu2.disply2();
		
		
		
	}

}
