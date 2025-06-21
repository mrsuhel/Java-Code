class StringMutableDemo{
	public static void main(String[] args){
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder(10);
		StringBuilder sb2=new StringBuilder("Lucknow");
		System.out.println(sb.length()+" "+sb.capacity());
		System.out.println(sb1.length()+""+sb1.capacity());
		System.out.println(sb2.length()+" "+sb2.capacity());
	}
}
