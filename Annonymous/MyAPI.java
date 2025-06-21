class AnInterface{
	void printer(){}
}
class MyAPI{
	public void caller(AnInterface ai){
		ai.printer();
	}
}
class APITester{
	public static void main(String[] args){
		MyAPI ma=new MyAPI();
		AnInterface ai=new AnInterface(){
			void printer(){
				System.out.println("printer method");
			}
		};
		ma.caller(ai);
	}
}
