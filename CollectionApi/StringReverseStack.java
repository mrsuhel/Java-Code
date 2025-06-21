import java.util.Stack;
class StringReverseStack{
        public static void main(String[] args){
		String str="Lucknow";
		System.out.println(str);
                Stack<Character> st=new Stack<>();
		for(int i=0;i<str.length();i++){
			st.push(str.charAt(i));
		}
		StringBuilder sb=new StringBuilder();
                while(!st.empty()){
                        sb.append(st.pop());
                }
		str=sb.toString();
		System.out.println(str);
        }
}

