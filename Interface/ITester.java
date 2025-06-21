class ITester{
	public static void main(String[] args){
		I1 i1=Factory.getInstance();
		I2 i2=i1.m1();
		I3 i3=i2.m2();
		i3.m3();
	}
}
