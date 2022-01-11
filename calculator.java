package week3.day1;

public class calculator
{
	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	
public void add(int num1,int num2,int num3) {
	System.out.println(num1+num2+num3);
	

}
	public void sub(int a,int b) {
		System.out.println(a-b);

	}
	
	public void sub(double a,double b) {
	System.out.println(a-b);	


	}
	
	
	public void multi(int a,int b) {
		
System.out.println(a*b);
	}
	
	public void multi(int a,double b) {
		System.out.println(a*b);

	}
	
	public void div(int a,int b) {
		System.out.println(a/b);

	}
public void div(double a,int b) {
	System.out.println(a/b);
}
	public static void main(String[] args) {
	calculator calc=new calculator();
	calc.add(3, 6);
	calc.add(5, 7, 8);
	calc.div(111.5, 20);
	calc.div(54, 7);
	calc.multi(9, 6);
	calc.multi(7, 9.5);
	calc.sub(87, 43);
	calc.sub(50.6, 45.4);
	}

}
