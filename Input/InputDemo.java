import java.util.Scanner;
class InputDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int x,y;
		System.out.println("enter first number");
		x=sc.nextInt();
		System.out.println("Enter second number");
		y=sc.nextInt();
		int z=(x>=y)?x:y;
		System.out.println("max= "+z);
	}
}
