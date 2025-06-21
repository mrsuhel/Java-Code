abstract class FinalTestDemo{
	abstract  Void display(){
		System.out.println("Display method");
	}
}
class FTDemo extends FinalTestDemo{
	public void display(){
		System.out.println("Display method of FTDemo");
	}
}
class FTTest{
	public static void main(String[] args){
	FTDemo ftd=new FTDemo();
	ftd.demo();
	}
}
