import java.util.Stack;
class WellFormed{
	public boolean wellFormed(String str){
		Stack<Character> st=new Stack<>();
		char ch;
		for(int i=0;i<str.length();i++){
			ch=str.charAt(i);
			switch(ch){
				case '(':
					st.push(ch);
					break;
				case '{':
					st.push(ch);
					break;
				case '[':
					st.push(ch);
					break;
				case')':
					if(!st.empty()&&st.pop()=='(');
					else return false;
					break;
				case'}':
					if(!st.empty()&&st.pop()=='{');
					else return false;
					break;
				case']':
					if(!st.empty()&&st.pop()=='[');
					else return false;
					break;
				default:
					return false;
			}
		}
		return st.empty();
	}
}
class WellFormedTester{
	public static void main(String[] args){
		String str="[{()}]";
		WellFormed wf=new WellFormed();
		System.out.println(wf.wellFormed(str));
	}
}
