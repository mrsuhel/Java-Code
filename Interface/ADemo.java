class ADemo extends AdopterDemo{
	public void show(){
		System.out.println("Show method");
	}
}
class ADemoTest{
	public static void main(String[] args){
		ADemo ad=new ADemo();
		ad.show();
	}
}
