import java.util.ArrayList;
class ArrayListDemo{
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		//for(int i=0;i<al.size();i++){
		//	System.out.println(al.get(i));
		//}
		for(Integer x:al){
			System.out.println(x);
		}/*foreach loop for collection api*/
	}
}
