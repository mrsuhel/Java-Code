class MLOuter{
	int x=10;
	public void myMethod(){
		int a=10;
		class MLInner{
			public void show(){
				System.out.println("x="+x);
				System.out.println("a="+a);
			}
		}
		MLInner ml=new MLInner();
		ml.show();
	}
}
class Tester{
	public static void main(String[] args){
		MLOuter mlo=new MLOuter();
		mlo.myMethod();
	}
}
