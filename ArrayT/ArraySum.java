class ArraySum{
	public static void main(String[]args){
		int [] arr={5,7,3,4,6};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("Sum="+sum);
	}
}
