class Parent{
	final void fun(){
		System.out.print("Parent fun");
	}
}

class Child extends Parent{
	void fun(){
		System.out.println("Child fun");
	}
}

class Client{
	public static void fun(String[] args){
		Parent obj=new Child();
		obj.fun();
	}
}


