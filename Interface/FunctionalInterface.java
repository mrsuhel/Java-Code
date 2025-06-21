interface FunctionalInterface{
	public void printer(String s);
}
class MyFDemo{
	public void caller(FunctionalInterface fi,String s){
		fi.printer(s);
	}
}
class FunctionalTester{
	public static void main(String[] args){
		MyFDemo mfi=new MyFDemo();
		mfi.caller(s->{System.out.println("printer method");System.out.println(s);},"Lucknow");
	}
}
