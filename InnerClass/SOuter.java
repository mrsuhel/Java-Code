class SOuter{
	int x=10;
	static  class SInner{
		public void printer(){
			System.out.println(new SOuter().x);
		}
	}
}

