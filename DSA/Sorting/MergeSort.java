class MergeSort{
	 int[] mergeSort(int[]a,int[]b){
		int []c=new int[a.length+b.length];
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
			if(a[i]<=b[j]){
				c[k]=a[i];
				i++;
				k++;
			}else{
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length){
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<b.length){
			c[k]=b[j];
			k++;
			j++;
		}
		return c;
	}
}
class PrinttArray{
	public void printArray(int[]a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class MergeTester{
	public static void main(String[] args){
		int[]a={2,4,6,7,9};
		int[]b={3,8,10,11,12};
		PrintArray pa=new PrintArray();
		MergeSort ms=new MergeSort();
		pa.printArray(a);
		pa.printArray(b);
		int[] w=ms.mergeSort(a,b);
		pa.printArray(w);
	}
}
