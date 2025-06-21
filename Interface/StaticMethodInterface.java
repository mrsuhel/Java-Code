interface StaticMethodInterface{
	static  void printer(){
		System.out.println("Printer od S method");
	}
	void show();
}
class DSClass implements StaticMethodInterface{
	public void show(){
		System.out.println("Show Metho");
	}
/*	public void printer(){
		System.out.println("printer of d class");
	}*/
}

