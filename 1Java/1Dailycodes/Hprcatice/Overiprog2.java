class Parent{
	Parent(){
		System.out.println("parent Comstructor ");
	}

	void fun(int x){
		System.out.println("In Parent Fun ");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("In child constructor ");
	}

	void fun(int x){
		System.out.println("In Child Fun ");
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
		obj.fun(10);
	}
}


