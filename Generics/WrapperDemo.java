class DataHolder{
	Object obj;
}
class WrapperDemo{
	public static void main(String[] args){
		int x=25;
		Integer it=new Integer(x);
		DataHolder dt=new DataHolder();
		dt.obj=it;
		Integer i=(Integer)dt.obj;
		int k=i.intValue();
		System.out.println(k);
	}
}
