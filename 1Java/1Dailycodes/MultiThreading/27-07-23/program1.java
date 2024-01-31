class MyThread extends Thread{
	MyThread(ThreadGroup tg,String str){
		super(tg,str);
	}


          
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
	public static void main(String[] args){

		ThreadGroup pThreadGp=new ThreadGroup("India");

		MyThread t1=new MyThread(pThreadGp,"Maha");
		MyThread t2=new MyThread(pThreadGp,"Gao");

		t1.start();
		t2.start();

		ThreadGroup cThreadGP =new ThreadGroup(pThreadGp,"Pakistan");

		MyThread t3=new MyThread(cThreadGP,"Karachi");
		MyThread t4=new MyThread(cThreadGP,"Lahore");

		t3.start();
		t4.start();

		ThreadGroup cThreadGP2=new ThreadGroup(pThreadGp,"Bangladesh");

                MyThread t5=new MyThread(cThreadGP2,"Dhaka");
		MyThread t6=new MyThread(cThreadGP2,"Mirpur");
                t5.start();
		t6.start();
         
              //  cThreadGP.interrupt();

		System.out.println(pThreadGp.activeCount());
		System.out.println(pThreadGp.activeGroupCount());

	}
}
