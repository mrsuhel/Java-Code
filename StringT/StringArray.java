class StringArray{
	public static void main(String[] args){
		String s1="Lucknow";
		System.out.println(s1);
		char temp;
		char[] str=s1.toCharArray();
		int i=0;
		int j=str.length-1;
		while(i<j){
			temp=str[i];
			str[i]=str[j];
			str[j]=temp;
			i++;
			j--;
		}
		s1=new String(str);
		System.out.println(s1);
	}
}
