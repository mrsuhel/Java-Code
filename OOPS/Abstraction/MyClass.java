abstract class MyClass{
	void printer(){
		System.out.println("printer of MyClass");
	}
}
class Factory{
	public static MyClass getInstance(){
		return new MClass();
	}
}
class MClass extends MyClass{
	void printer(){
		System.out.println("printer of Mclass");
	}
}
