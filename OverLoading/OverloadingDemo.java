class OverloadingDemo{
	int add(int x,int y){
		return x+y;
	}
}
class Demo extends OverloadingDemo{
	int add(int x,int y,int z){
		return x+y+z;
	}
}
class OTester{
	public static void main(String[] args){
		Demo od=new Demo();
		System.out.println(od.add(1,2,5));
		System.out.println(od.add(1,5));
	}
}
