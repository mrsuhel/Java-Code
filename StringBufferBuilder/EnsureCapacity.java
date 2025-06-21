class EnsureCapacity{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder(10);
		sb.append("Lucknow");
		sb.ensureCapacity(50);
		System.out.println(sb.capacity());
		System.out.println(sb);
		//sb.reverse();
		//System.out.println(sb);
		sb.insert(4,"for");
		System.out.println(sb);
		sb.replace(7,10,"later");
		System.out.println(sb);
		sb.delete(4,7);
		System.out.println(sb);
		String s=sb.toString();
		System.out.println(s);
	}
}

