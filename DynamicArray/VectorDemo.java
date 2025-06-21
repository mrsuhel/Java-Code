import java.util.Vector;
class VectorDemo{
	public static void main(String[] args){
		Vector v=new Vector();
		System.out.println(v.capacity());
//		v.add(10);
//		v.add(20);
//		v.add(30);
		for(int i=0;i<11;i++){
			v.add(i+10);
		}
		for(int i=0;i<v.size();i++){
			System.out.println(v.get(i));
		}
		System.out.println(v.capacity());
	}
}
