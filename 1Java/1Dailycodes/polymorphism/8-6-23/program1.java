class Parent{
	public void fun(){                         //Acccess Specifier Public
		System.out.println("Parent fun");
	}
}
class Child extends Parent{
	void fun(){                                //Access Specifier Default
		System.out.println("Child fun");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
	}
}
