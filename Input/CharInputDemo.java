import java.util.Scanner;
class CharInputDemo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char st;
		System.out.println("enter a char");
		st=sc.next().charAt(0);
		System.out.println(st);
	}
}

