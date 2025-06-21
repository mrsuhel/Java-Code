class ZeroOneSwap{
	public static void main(String[] args){
		int []a={0,1,0,1,1,0,0,1,0,1,0};
		int temp;
		int i=0,j=a.length-1;
		for(int c=0;c<a.length;c++){
			System.out.print(a[c]+" ");
		}
		System.out.println();
		while(i<j){
			while(a[i]==0)i++;
			while(a[j]==1)j--;
			if(i<j){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
		System.out.println();
	}
}
