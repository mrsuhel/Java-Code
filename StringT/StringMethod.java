class StringMethod{
	public static void main(String[] args){
		String s1=new String("KanpurNagpur");
		String s2=" Lucknow Junction ";
		String city="Lucknow Junction";
		String ucity=city.toUpperCase();
		String lcity=city.toLowerCase();
		String s3=s2.trim();
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++){
			System.out.println(s1.charAt(i));
		}
		System.out.println(s1.indexOf('p'));
		System.out.println(s1.lastIndexOf('p'));
		System.out.println(ucity);
		System.out.println(lcity);
	}
}
