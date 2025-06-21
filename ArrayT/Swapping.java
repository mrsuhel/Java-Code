class Swapping{
	public static void main(String[] args){
		int[]a={2,4,6,8,12,14};
		int i=0;int j=a.length-1;
		for(int l=0;l<a.length;l++){
			System.out.print(a[l]+" ");
		}
		System.out.println();
		/* Another way to swap;
			while(i<j){
			a[i]=a[i]+a[j];
			a[j]=a[i]-a[j];
			a[i]=a[i]-a[j];
			i++;
			j--;
		}*/
		/*Another way to swap;
			while(i<j){
			a[i]=a[i]^a[j];
			a[j]=a[i]^a[j];
			a[i]=a[i]^a[j];
			i++;
			j--;
		}*/
		int temp;
		while(i<j){
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<a.length;k++){
			System.out.print(a[k]+" ");
		}
		System.out.println();
	}
}
