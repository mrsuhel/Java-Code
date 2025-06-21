interface I1{
	I2 m1();
}
interface I2{
	I3 m2();
}
interface I3{
	void m3();
}
class A implements I1{
	public I2 m1(){
		System.out.println("m1 method");
		return new B();
	}
}
class B implements I2{
	public I3 m2(){
		System.out.println("m2 method");
		return new C();
	}
}
class C implements I3{
	public void m3(){
		System.out.println("m3 method");
	}
}
class Factory{
	public static I1 getInstance(){
		return new A();
	}
}

