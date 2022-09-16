package oops;

public class studentmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3.using constrctor
		student stu1=new student(32, "pooja", 'A');//3.using constrctor direct assign values 
	
		
		//student stu1=new student();//using while refrence variables and methods 
		
	// 1.assign value by using reference variables  	
		
		/*stu1.sid =32;
		stu1.nme="pooja";
		stu1.grade='A';*/
		
		//2.using getvalue,assign value by using method
		//stu1.getvalues(32, "pooja", 'A');
		
		stu1.display();

	}

}
