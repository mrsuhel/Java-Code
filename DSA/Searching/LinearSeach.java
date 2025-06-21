import java.util.Scanner;
class LinearSeach{
	public int linearSearch(int[]a,int data){
		for(int i=0;i<a.length;i++){
			if(data==a[i])return i;
		}
		return -1;
	}
}
class LinearTester{
	public static void main(String[] args){
		int arr[]={3,4,7,2,9,8,1,6,5};
		int data;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		data=sc.nextInt();
		LinearSeach ls=new LinearSeach();
		int result=ls.linearSearch(arr,data);
		if(result==-1){
			System.out.println("Data not found");
		}else{
			System.out.println("Data found at index of" +result);
		}
	}
}
