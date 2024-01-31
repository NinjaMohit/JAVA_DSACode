class MyThread implements Runnable{
	
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}

class ThreadGroupDemo{
	public static void main(String[] args)throws InterruptedException{

		ThreadGroup pThreadGp=new ThreadGroup("India");
                
		MyThread obj1=new MyThread();
		MyThread obj2=new MyThread();

		Thread t1=new Thread(pThreadGp,obj1,"Mumbai");
		Thread t2=new Thread(pThreadGp,obj2,"Pune");

		t1.start();
		t2.start();
	}
}



		
		
	
