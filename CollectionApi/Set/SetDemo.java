import java.util.*;
class SetDemo{
	public static void main(String[] args){
		String str="Lucknow Junction";
		Set<Character> st=new TreeSet<>();
		for(int i=0;i<str.length();i++){
			st.add(str.charAt(i));
		}
		System.out.println("Number of uniqu characters:"+st.size());
		for(Character ch:st){
			System.out.print(ch+" ");
		}
		System.out.println();
	}
}
