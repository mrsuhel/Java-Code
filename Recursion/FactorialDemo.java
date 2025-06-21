/*class FactorialDemo{
	int fact(int n){
		if(n==0||n==1){
			return 1;
		}
		return n*fact(n-1);
	}
}*/
class FactorialDemo{
	int fact(int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result=result*i;
		}
		return result;
	}
}
class FactorialTest{
	public static void main(String[] args){
		int data=5;
		FactorialDemo fd=new FactorialDemo();
		System.out.println(fd.fact(data));
	}
}
