import java.util.concurrent.*;

import java.util.*;

class BlockingQueueDemo{
	public static void main(String[] args)throws InterruptedException{

		BlockingQueue bQueue=new ArrayBlockingQueue(3);
		bQueue.put(10);
		bQueue.put(20);
		bQueue.put(30);
		bQueue.offer(40,5,TimeUnit.SECONDS);

		System.out.println(bQueue);

		bQueue.take();
		System.out.println(bQueue);

		ArrayList al=new ArrayList();
		System.out.println("ArrrayList"+al);

		bQueue.drainTo(al);
		System.out.println("ArrayList  : "+al);
		System.out.println(al);
	}
}
