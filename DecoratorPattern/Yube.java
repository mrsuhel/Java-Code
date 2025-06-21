public class Yuba{
	public static void main(String[] args){
		Beverage b=new Expresso();
		System.out.println(b.getDescription()+" "+b.cost());
		Beverage b2=new Mocha(b);
		System.out.println(b2.getDescription()+" "+b2.cost());
	}
}
