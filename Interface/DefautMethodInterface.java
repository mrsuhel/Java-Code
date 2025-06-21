interface DefaultMethodInterface{
	default void printer(){
		System.out.println("Printer of default method");
	}
	void show();
}
class DClass implements DefaultMethodInterface{
	public void show(){
		System.out.println("Show Metho");
	}
//	public void printer(){
//		System.out.println("printer of d class");
//	}
}

