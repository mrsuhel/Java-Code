class StringVowConst{
	public static void main(String[] args){
		String city=" Lucknow Junction ";
		String str=city.trim().toLowerCase();
		int nconst=0,nvow=0;
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
				nvow++;
			}else if(c>=97&&c<=122){
				nconst++;
			}
		}
		System.out.println("no of vowels="+nvow);
		System.out.println("no of const="+nconst);
	}
}
