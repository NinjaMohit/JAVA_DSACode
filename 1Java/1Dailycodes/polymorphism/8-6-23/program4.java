//Method Hiding Concept

class Parent{
	static void fun(){
		System.out.println("In Parent fun");
	}
}
class Child extends Parent{
	static void fun(){
		System.out.println("In Child fun");
	}
}

class Client{
	public static void main(String[] args){
		Parent obj1=new Parent();
		Child obj2=new Child();
                Parent obj3=new Child();
	}
}
