class BeanDemo{
	private int age;
	private String name;
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}
class BeanTester{
	public static void main(String[] args){
		BeanDemo bd=new BeanDemo();
		bd.setAge(20);
		System.out.println(bd.getAge());
		bd.setName("Suhel");
		System.out.println(bd.getName());
	}
}
