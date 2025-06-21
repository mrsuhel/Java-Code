class BubbleSorting{
	public void bubbleSorting(int[]a){
		int flag=0;
		for(int i=1;i<a.length;i++){
			flag=0;
			for(int j=1;j<a.length-i+1;j++){
				if(a[j-1]>a[j]){
					flag=1;
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
			if(flag==0)break;
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
class BubbleTester{
	public static void main(String[] args){
		int arr[]={4,2,8,7,6,5};
		BubbleSorting bs=new  BubbleSorting();
		ArrayPrint ap=new ArrayPrint();
		ap.print(arr);
		bs.bubbleSorting(arr);
		ap.print(arr);
	}
}
