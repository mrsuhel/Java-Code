class Parent{
	void printer(){
		System.out.println("printer of Parent");
	}
}
class Child extends Parent{
	void printer(){
		System.out.println("printer of child");
		super.printer();
	}
}
class TestDemo{
	public static void main(String[] args){
		Child c=new Child();
		c.printer();
	}
}
