import java.util.*;

class Demo{
	public static void main(String[] args){
		Queue que=new LinkedList();

		que.offer(10);
		que.offer(20);
		que.offer(30);
		que.offer(40);
		que.offer(50);

		System.out.println(que);

		System.out.println(que.peek());
		System.out.println(que.element());
		System.out.println(que);

	}
}



