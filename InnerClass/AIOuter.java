interface AIInterface{
	void printer();
}
class AIOuter{
	int x=10;
	AIInterface aii=new AIInterface(){
		public void printer(){
			System.out.println(x);
		}
	};
}
class AITester{
	public static void main(String[] args){
		AIOuter aoi=new AIOuter();
		aoi.aii.printer();
	}
}
