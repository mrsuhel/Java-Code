class Merging{
	void merge(int[]a,int[]b){
		int i=a.length-1;
		int j=b.length-1;
		int k=b.length-a.length-1;
		while(k>-1){
			if(a[i]>b[k]){
				b[j]=a[i];
				i--;
			}else{
				b[j]=b[k];
				k--;
			}
			j--;
		}
		while(i>-1){
			b[j]=a[i];
			j--;
			i--;
		}
		while(j>-1){
			b[j]=b[k];
			j--;
		}	k--;
	}
}
class PrintA{
	void printArray(int[]a){
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}
class MergingTest{
	public static void main(String[] args){
		int[]a={2,4,6,8};
		int[]b={3,7,15,20,0,0,0,0};
		PrintA pa=new PrintA();
		Merging m=new Merging();
		pa.printArray(a);
		pa.printArray(b);
		m.merge(a,b);
		pa.printArray(b);
	}
}
