/*class LinearSearch implements Runnable{
	static int[]arr=null;
	static int data=0;
	public void run(){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==data)return i;
		}
		return -1;
	}
}*/
class BinarySearch implements Runnable{
	static int[] arr=null;
	static int data=0;
	public int bsearch (int[]a,int si,int li,int data){
		if(si<=li){
			int mid=(si+li)/2;
			if(a[mid]==data)return mid;
			if(a[mid]>data)return bsearch(a,si,mid-1,data);
			if(a[mid]<data)return bsearch(a,mid+1,li,data);
		}else{
			return -1;
		}
	}
	public void run(){
		bsearch(arr,0,arr.length-1,data);
	}
}
class SortingTester{
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8};
		BinarySearch.arr=a;
		BinarySearch.data=20;
		Runnable r=new BinarySearch();
		Thread t1=new Thread(r);
		t1.start();
	}
}
