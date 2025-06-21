interface AnInterface{
	void printer();
}
class AnTester{
	public static void main(String[] args){
		AnInterface ai=new AnInterface(){
			public void printer(){
				System.out.println("printer method");
			}
		};
		ai.printer();
	}
}
