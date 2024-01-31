// Return Type matter in Overriding for only Primitive data type


class Parent{
	char fun(){
		System.oyut.println("Parent fun");
		return 'A';
	}//return type char
}

class Child extends Parent{
	int fun(){
		System.out.println("Child fun");
		return 10;
	}//return type int so give error
}

class Client{
	public static void main(String[] args){
		Parent p=new Child();
		p.fun();
	}
}

