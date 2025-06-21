class NSOuter{
	int x=10;
	private class NSInner{
		public void display(){
			System.out.println(x);
		}
	}
	public static NSInner getInstance(){
		return new NSOuter().new NSInner();
	}
}

