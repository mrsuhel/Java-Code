interface InterfaceDemo{
	int x=10;
	void show();
}
class MyClass implements InterfaceDemo{
	public void show(){
		System.out.println("show method");
	}
}
class ITester{
	public static void main(String[] args){
		MyClass m1=new MyClass();
		m1.show();
		System.out.println(InterfaceDemo.x);
		System.out.println(MyClass.x);
		//InterfaceDemo.x=40; can not because of by default the valu of initilized value   interface is final;  

	}
}
