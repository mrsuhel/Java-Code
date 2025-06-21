final class FinalMethodDemo{
	final  public void show(){
		System.out.println("Show Method");
	}
}
class ChildDemo extends FinalMethodDemo{
	public void show(){
		System.out.println("show method of child");
	}
}
class FinalTestDemo{
	public static void main(String[] args){
		ChildDemo cd =new ChildDemo();
		cd.show();
	}
}
