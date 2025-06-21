class StringApendDemo{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder(10);
		System.out.println(sb.length()+" "+sb.capacity());
		sb.append("Lucknow");
		System.out.println(sb.length()+" "+sb.capacity());
		sb.append(" Junction");
		System.out.println(sb.length()+" "+sb.capacity());
	}
}
