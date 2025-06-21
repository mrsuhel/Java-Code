class FinalDemo{
	static  final int x=10;
	/*FinalDemo(int a){
		x=a;
	}*/
}
class FinalTest{
	public static void main(String[] args){
		FinalDemo fd=new FinalDemo();
		System.out.println(fd.x);
//		fd.x=20;
	}
}
