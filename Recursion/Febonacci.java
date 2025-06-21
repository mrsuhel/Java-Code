/*class Febonacci{
	int feb(int n){
		if(n==1||n==2)return 1;
		return feb(n-1)+feb(n-2);
	}
}*/
class Febonacci{
	int feb(int n){
		int x=1;
		int y=1;
		int result=1;
		for(int i=3;i<=n;i++){
			result=x+y;
			x=y;
			y=result;
		}
		return result;
	}
}
class FebonacciTest{
	public static void main(String[] args){
		int n=6;
		Febonacci fb=new Febonacci();
		System.out.println(fb.feb(n));
	}
}
