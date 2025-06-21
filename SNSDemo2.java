class SNSDemo2{
	static{
		System.out.println("static block");
	}
	{
		System.out.println("Non-Static blocl");
	}
}
class SNSTest{
	public static void main(String[] args){
		System.out.println("main loaded");
		SNSDemo s1=new SNSDemo();
		SNSDemo s2=new SNSDemo();
		System.out.println("Exiting main");
	}

}
