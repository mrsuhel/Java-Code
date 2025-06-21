import java.util.*;
class ArrayDequeDemo{
	public static void main(String[]args){
		ArrayDeque<Character> qu=new ArrayDeque<>();
		String s="Lucknow Junction";
		for(int i=0;i<s.length();i++){
			qu.addLast(s.charAt(i));
		}
		while(!qu.isEmpty()){
			char c=qu.removeFirst();
			if(c>=97&&c<=122){
				c=(char)(c^32);
			}
			System.out.println(c);
		}
	}
}
