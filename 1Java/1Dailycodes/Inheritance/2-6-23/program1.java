class Parent{
	int x=10;

	Parent(){
		System.out.println("In Parent Constructor: ");
	}

	void access(){
		System.out.println("Parent Instance: ");
	}
}

class Child extends Parent{
	int y=20;
	Child(){
		System.out.println("In child Constructor: ");
	}
}

class Client{
	public static void main(String[] args){

		Child obj=new Child();
		obj.access();
	}
}
