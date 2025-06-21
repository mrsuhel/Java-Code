public class PrivateDemo{
	int x;
	static PrivateDemo pd=null;
	PrivateDemo(int a){x=a;}
	public void display(){
		System.out.println("x="+x);
	}
	public static PrivateDemo factory(int m){
		if(pd==null){
			pd=new PrivateDemo(m);
		}
		return pd;
	}
}
