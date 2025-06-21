class StringtrimToSize{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder(10);
		sb.append("Lucknow");
		System.out.println(sb.length()+" "+sb.capacity());
		sb.trimToSize();
		System.out.println(sb.length()+" "+sb.capacity());
	}
}
