class LoomtoPartition{
	public int lomutoAlgo(int[]a,int low,int high){
		int pivot=high;
		int i=low-1;
		int temp;
		for(int j=0;j<=high;j++){
			if(a[j]<=a[pivot]){
				i++;
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
		return i;
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
class LoomtoPartitionTester{
	public static void main(String[] args){
		int []a={3,4,2,8,7,1,6,5};
		LoomtoPartition lpar=new LoomtoPartition();
		PrintArray pa=new PrintArray();
		pa.printArray(a);
		lpar.lomutoAlgo(a,0,a.length-1);
		pa.printArray(a);
	}
}
