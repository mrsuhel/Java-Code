class Partition{
	public int laareAlgo(int[]a,int low,int high){
		int pivot=low-1;
		while(low<=high){
			while(low<=high&&a[low]<=a[pivot])low++;
			while(low<=high&&a[high]>a[pivot])high--;
			if(low<high){
				int temp=a[low];
				a[low]=a[high];
				a[high]=temp;
			}
		}
		int temp=a[pivot];
		a[pivot]=a[high];
		a[high]=temp;
		return high;
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
class PartitionTester{
	public static void main(String[] args){
		int []a={3,4,2,8,7,1,6,5};
		Partition par=new Partition();
		PrintArray pa=new PrintArray();
		pa.printArray(a);
		par.laareAlgo(a,1,a.length-1);
		pa.printArray(a);
	}
}
