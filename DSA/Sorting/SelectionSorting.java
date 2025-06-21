class SelectionSorting{
	public void selectionSort(int[]a){
		int index;
		for(int i=0;i<a.length-1;i++){
			index=i;
			for(int j=i+1;j<a.length;j++){
				if(a[j]<a[index]){
					index=j;
				}
			}
			int temp=a[index];
			a[index]=a[i];
			a[i]=temp;
		}
	}
}
class PrintArray{
	public void printArray(int[]a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class SelectionTester{
	public static void main(String[] args){
		int []a={5,7,3,4,2,6};
		SelectionSorting ss=new SelectionSorting();
		PrintArray pa=new PrintArray();
		pa.printArray(a);
		ss.selectionSort(a);
		pa.printArray(a);
	}
}
