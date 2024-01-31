/// Private
//
class Parent{
         static void fun(){
		System.out.println("In Parent fun ");
	}

}

class Child extends Parent{
	 static void fun(){
		System.out.println("IN child Fun");
	}
}

class Client{
	public static void main(String[] args){
	
	        Parent obj1=new Parent();
		obj1.fun();

		Child obj2=new Child();
		obj2.fun();
	
		Parent obj=new Child();
		obj.fun();
	}
}
