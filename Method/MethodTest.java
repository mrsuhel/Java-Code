class MethodTest{
	void printer(){
		System.out.println("printer method");
	}
	static void show(){
		System.out.println("static method");
	}
	void caller(){
		printer();
		show();
	}
	public static void main(String[] args){
		show ();
		MethodTest md =new MethodTest();
		md.printer();
		md.show();
		md.caller();
	}
}
