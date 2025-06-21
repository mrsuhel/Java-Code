class RowMajorArray{
	public static void main(String[] args){
		int [][]a={{1,2,3,4,5},{2,4,6,8,10},{3,5,7,9,11},{10,20,30,40,50}};
		int[]b=a[2];
		for(int i=0;i<5;i++){
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
}
