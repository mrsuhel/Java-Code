class DataHolder1<T>{
	T t;
}
class GenericDemo{
	public static void main(String[] args){
		DataHolder1<Integer> dt=new DataHolder1<>();
		dt.t=30;
		System.out.println(dt.t);
		DataHolder1<String> dts=new DataHolder1<>();
		dts.t="Lucknow";
		System.out.println(dts.t);
	}
}
