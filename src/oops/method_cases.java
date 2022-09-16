package oops;

public class method_cases {private static method_cases cal;
//write on class not on menthod
	
	int x=10;
	int y=20;
	
	/*void sum()//1.not taking parameter & not returing any value.
	{
		System.out.println(x+y);
	}*/

	/*int sum() { //2,not taking parameter and giving value.
		return(x+y);
	}*/
	
	void sum(int a,int b) {//3, taking parameter and not giving value.
		
		System.out.println(a+b);
	}
	
	/*int sum(int a, int b) {//4.aking parameter and giving value.
		return(a+b);
	}*/
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		method_cases cal=new method_cases();
		
		//cal.sum();//case1
		
		
		/*int res=cal.sum();//case 2
		System.out.println(res);///or below
		System.out.println(cal.sum());*/
		
		cal.sum(13, 33);//case 3
		
		//System.out.println(cal.sum(12,13));//case4
	}

}
