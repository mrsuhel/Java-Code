class ThisDemo{
	int x=10;
	void display(){
		int x=20;
		System.out.println(this.x);
	}
}
class ThisTest{
	int a=50;
	public static void main(String[] args){
		ThisDemo td=new ThisDemo();
		td.display();
//		System.out.println(this.a);
	}
}
