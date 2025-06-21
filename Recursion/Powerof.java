/*class Powerof{
	int PowerTo(int x,int n){
		if(n==0){
			return 1;
		}
		if(n==1){
			return x;
		}
		return x*PowerTo(x,n-1);
	}
}*/
/*class Powerof{
	int power(int x,int n){
		int result=1;
		for(int i=1;i<=n;i++){
			result=result*x;
		}
		return result;
	}
}*/
class PowerIn{
	public static void main(String[] args){
		int n=5,x=2;
		Powerof p=new Powerof();
		System.out.println(p.power(x,n));
	}
}
