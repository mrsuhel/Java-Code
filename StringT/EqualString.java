class EqualString{
	public static void main(String[] args){
		String s1="Lucknow";
		String s2="Lucknow";
		String s3="lucknow";
		boolean b1=s1.equals(s2);
		boolean b2=s1.equalsIgnoreCase(s3);
		System.out.println(b1);
		System.out.println(b2);
	}
}
