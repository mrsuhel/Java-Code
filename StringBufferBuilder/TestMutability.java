class TestMutability{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder("Lucknow");
		StringBuilder sb2=sb.reverse();
		boolean b=(sb==sb2);
		System.out.println(b);
		System.out.println(sb);
		System.out.println(sb2);
	}
}
