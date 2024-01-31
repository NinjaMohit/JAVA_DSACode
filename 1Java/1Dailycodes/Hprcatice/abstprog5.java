abstract class Demo{
	void move(){
		System.out.println("move");

	}
	abstract static void run();
	void fun(){
		System.out.println("Fun");
	}

}
class Child extends Demo
{
	void run(){
		System.out.println("run");
	}
}

class Client{
	public static void main(String[] args){
		Child obj=new Child();
		obj.move();
		obj.run();
		obj.fun();
	}
}
