import java.util.*;
class HashMapDemo{
	public static void main(String[] args){
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1,"Amit Kumar");
		mp.put(2,"Suhel Ansari");
		mp.put(3,"sarik mazher");
		mp.put(4,"shoaib pathan");
		//System.out.println(mp.get(2));
		//mp.put(2,"salim ansari");
		//System.out.println(mp.get(2));
		Set<Integer> keys=mp.keySet();
		for(Integer i:keys){
			System.out.println(mp.get(i));
		}
	}
}
