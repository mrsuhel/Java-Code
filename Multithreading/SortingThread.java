class SelectSortingThread implements Runnable{
	public void run(){
		int min,temp;
		for(int i=1;i<arr.length();i++){
			min=i-1;
			for(int j=i;j<arr.length();j++){
				if(arr[i]<min){
					min=j;
				}
			}
			temp=arr[i-1];
			arr[i-1]=min;
			min=temp;
		}
	}
}
class InsertionSorthingThreadDemo implements Runnable{
	public void run(){
		int temp,j;
		for(int i=1;i<len;i++){
			temp=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>temp){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
}
class SortingTester{
	public static void main(String[] args){
		int arr[]={1,5,8,3,9,6,4,2,7};
		Runnable st=new SortingThread();
		Runnable std=new SortingThreadDemo();
		Thread t1=new Thread(st);
		Thread t2=new Thread(std);
		System.out.println("Selection"=+t1.start());
		System.out.println("insertion"=+t2.start());
	}
}
