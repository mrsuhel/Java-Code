class CDemo{
	int x;
	float y;
	String z;
	CDemo(int a,String b){
		x=a;
		z=b;
	}
	CDemo(int a,float b,String c){
		this(a,c);
		y=b;
	}
}
class CMain{
	public static void main(String[] args){
		CDemo cd=new CDemo(5,3.5f,"Lucknow");
		System.out.println(cd.x+" "+cd.y+" "+cd.z);
	}
}
