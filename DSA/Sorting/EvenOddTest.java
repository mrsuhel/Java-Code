class EvenOddTest{
	public void evenOdd(int[]a){
		int i=0;
		int j=a.length-1;
		while(i<j){
			while(a[i]%2==0)i++;
			while(a[j]%2==1)j--;
			if(i<j){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
}
/*class PrintArray{
	public void printArray(int[]a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}*/
class EvenOddTester{
	public static void main(String[] args){
		int arr[]={2,4,3,7,9,8,10,1};
		PrintArray pa=new PrintArray();
		EvenOddTest eot=new EvenOddTest();
		pa.printArray(arr);
		eot.evenOdd(arr);
		pa.printArray(arr);
	}
}
