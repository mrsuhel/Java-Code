class ThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<5000;i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class ThreadDemoTester{
	public static void main(String[] args){
		ThreadDemo t1=new ThreadDemo();
		ThreadDemo t2=new ThreadDemo();
		t1.start();
		t2.start();
	}
}
