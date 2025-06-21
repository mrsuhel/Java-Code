class BaseClass{
	void printer(){
		System.out.println("Printer method of baseclass");
	}
}
class DrivenClass extends BaseClass{
	void show(){
		System.out.println("show method of driven class");
	}
	void printer(){
		System.out.println("printer method of drivenclass");
	}
}
class BaseTester{
	public static void main(String[] args){
		BaseClass d=new DrivenClass();
		d.printer();
//		d.show();
	}
}
