class SyncDemo{
	public synchronized void printer(){
		for(int i=0;i<5000;i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		//System.out.println();
	}
	public static SyncDemo sd=null;
	public static synchronized SyncDemo getInstance(){
		if(sd==null){
			sd=new SyncDemo();
		}
		return sd;
	}
}
class  ThreadDemoTest implements Runnable{
	public void run(){
		SyncDemo sd=SyncDemo.getInstance();
		sd.printer();
	}
}
class ThreadMainTester{
	public static void main(String[] args){
		Runnable rn=new ThreadDemoTest();
		Thread t1=new Thread(rn,"firstthread");
		Thread t2=new Thread(rn,"secondthread");
		t1.setPriority(7);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}
}

