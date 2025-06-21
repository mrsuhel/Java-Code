import java.util.ArrayList;
import java.lang.Iterator;
class IteratorDemno{
	public static void main(String[] args){
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(40);
		al.add(50);
		Iterator<Integer> it=new Iterator<>();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
