class InsertionSort{
	public void insertionSorting(int[]a){
		for(int i=1;i<a.length;i++){
			int temp=a[i];
			int j=i-1;
			while(j>=0&&a[j]>=temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;;
		}
	}
}
class ArrayPrint{
	public void print(int[]a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class InsertionTester{
	public static void main(String[] args){
		int arr[]={4,3,6,2,1,8,7};
		InsertionSort is=new  InsertionSort();
		ArrayPrint ap=new ArrayPrint();
		ap.print(arr);
		is.insertionSorting(arr);
		ap.print(arr);
	}
}
