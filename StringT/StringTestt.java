class StringTestt{
	public static void main(String[]args){
		String s1="Lucknow";
		String s2="Lucknow";
		StringMethods sm=new StringMethods();
		System.out.println(sm.sequals(s1,s2));
	}
}
class StringMethods{
	public boolean sequals(String s1,String s2){
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		//for case senstive;
		if(s1.length()!=s2.length()){
			return false;
		}
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
}
