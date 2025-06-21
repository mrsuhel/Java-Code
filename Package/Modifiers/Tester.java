class Tester{
	public static void main(String[] args){
		PrivateDemo pd= PrivateDemo.factory(10);
		pd.display();
		PrivateDemo pd2=PrivateDemo.factory(20);
		pd2.display();
	}
}
