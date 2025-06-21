import java.util.*;
class FrequencyDemo{
	public static void main(String[] args){
		String s="Lucknow Junction";
		Map<Character,Integer> freq=new HashMap<>();
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)==' ')continue;
			if(freq.get(s.charAt(i))==null){
				freq.put(s.charAt(i),1);
			}else{
				freq.put(s.charAt(i),freq.get(s.charAt(i))+1);
			}
		}
		Set<Character> st=freq.keySet();
		for(Character ch:st){
			System.out.println(ch+":"+freq.get(ch));
		}
	}
}
