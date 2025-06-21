class RunningSumArray{
	public static void main(String[] args){
		int[] arr={5,7,8,2,10};
		for(int i=1;i<arr.length;i++){
			arr[i]=arr[i-1]+arr[i];
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
