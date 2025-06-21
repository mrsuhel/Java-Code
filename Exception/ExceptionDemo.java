import java.util.Scanner;
class ExceptionDemo{
	public static void main(String[] args){
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		x=sc.nextInt();
		System.out.println("Enter second number");
		y=sc.nextInt();
		System.out.println(x/y);
	}
}
