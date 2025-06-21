class MyClassDemo implements MInterface{
	public void printer(){
		System.out.println("printer method");
	}
	public void show(){
	 	System.out.println("Show method");
	}
	public void display(){
		System.out.println("Display method");
	}
}
class InterfaceTest{
	public static void main(String[] args){
		MyClassDemo mcd=new MyClassDemo();
		mcd.printer();
		mcd.show();
		mcd.display();
	}
}
