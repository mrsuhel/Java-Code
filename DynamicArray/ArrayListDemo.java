import java.util.ArrayList;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();
//		v.add(10);
//		v.add(20);
//		v.add(30);
//		for(int i=0;i<11;i++){
//			al.add(i+10);
//		}
		al.add(10);
		al.add(3.5f);
		al.add("Lucknow");
		for(int i=0;i<al.size();i++){
			System.out.println(al.get(i));
		}
	//	System.out.println(al.capacity());
	}
}
