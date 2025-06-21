package mypkg;
public class PackageDemo{
	int add(int x,int y){
		int z=x+y;
		return z;
	}
	public static void main(String[] args){
		PackageDemo pkgd=new PackageDemo();
		System.out.println(pkgd.add(5,4));
	}
}

