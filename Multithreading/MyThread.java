class MyThread implements Runnable{
	public void run(){
		for(int i=0;i<5000;i++){
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
class ThreadTester{
	public static void main(String[] args){
		Runnable r=new MyThread();
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.start();
		t2.start();
	}
}
