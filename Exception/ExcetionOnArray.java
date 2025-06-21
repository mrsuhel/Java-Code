import java.util.Scanner;
class ExcetionOnArray{
	public static void main(String[] args){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n=sc.nextInt();
		int arr[]={5,3,2,7,8};
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

