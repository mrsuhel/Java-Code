class Logical{
	public static void main(String[] args){
		int x=10,y=20,z=30;
//		boolean a=(++x<++y)||(++y<++z);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		boolean b=(++x<++y)&&(++y<++z);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
