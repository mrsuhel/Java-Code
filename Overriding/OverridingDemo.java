class Overrinding{
	int add(int x,int y){
		return x+y;
	}
}
class Demo extends Overrinding{
	int add(int x,int y){
		return x+y+10;
	}
}
class OverDemo{
	public static void main(String[] args){
		Demo d=new Demo();
		System.out.println(d.add(2,4));
		System.out.println(d.add(2,5));
	}
}
