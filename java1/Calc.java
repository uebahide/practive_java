package calcapp.main;
public class Calc{
	public static void main(String[] args){
		System.out.print("a=");
		int a=new java.util.Scanner(System.in).nextInt();
		System.out.print("b=");
		int b=new java.util.Scanner(System.in).nextInt();

		int total=calcapp.logics.CalcLogic.tasu(a,b);
		int delta=calcapp.logics.CalcLogic.hiku(a,b);
	
		System.out.println("a+b="+total);
		System.out.println("a-b="+delta);
	}


}