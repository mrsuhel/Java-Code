import java.util.Scanner;
class BinarySearch{
	public int binarySearch(int []a,int si,int li,int data){
		if(si<=li){
			int mid=(si+li)/2;
			if(data==a[mid])return mid;
			if(data<a[mid])return binarySearch(a,si,mid-1,data);
			if(data>a[mid])return binarySearch(a,mid+1,li,data);
		}
			return -1;
	}
}
class BinaryTester{
	public static void main(String[] args){
		int arr[]={1,2,3,4,5,6,7,8};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data");
		int data=sc.nextInt();
		BinarySearch bs=new BinarySearch();
		int result=bs.binarySearch(arr,0,arr.length-1,data);
		if(result==-1){
			System.out.println("Data not found");
		}else{
			System.out.println("Data found at" +result);
		}
	}
}
