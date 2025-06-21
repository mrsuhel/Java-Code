/*class SumDemo{
	int sum(int n){
		if(n==1)return 1;
		return n+sum(n-1);
	}
}*/
/*class SumDemo{
	int sum(int n){
		int x=1;
		for(int i=2;i<=n;i++){
			x=x+i;
		}
		return x;
	}
}*/
class SumDemo{
	int sum(int n){
		return n*(n+1)/2;
	}
}
class SumTest{
	public static void main(String[] args){
		int  n=10;
		SumDemo sd=new SumDemo();
		System.out.println(sd.sum(n));
	}
}
