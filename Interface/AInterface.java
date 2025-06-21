interface AInterface{
	public void show();
}
class AClass implements AInterface{
	public void show(){
		System.out.println("show method of a class");
	}
}
class Factory{
	public static AInterface getInstance(){
		return new  AClass();
	}
}
