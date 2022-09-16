package oops;

public class student {
	// TODO Auto-generated method stub
	
	int sid;
	String name;
	char grade;
	
	student(int id,	String name1,char g)//this constructor 
	{
		sid=id;
		name=name1;
		grade=g;
	}
	
	void getvalues(int id,	String name1,char g)//this is method,no void because it won return anything
	{
		sid=id;
		name=name1;
		grade=g;
		
	}
	 void display() {
		
		System.out.println(sid+"  "+ name +" "+grade);
	}
	
	
}
