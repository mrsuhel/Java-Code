class MtehodDemo{
	void printer(){
		System.out.println("printer method");
	}
	static void show(){
		System.out.println("show method");
	}
}
class MethodMainClass{
	void call(){
		MtehodDemo.show();
		MtehodDemo m=new MtehodDemo();
		m.printer();
		m.show();
	}
	public static void main(String[] args){
		//show();without refrence we could not call;
		MtehodDemo.show();
		MtehodDemo md=new MtehodDemo();
		md.printer();
		md.show();
		new MethodMainClass().call();
	}
}
