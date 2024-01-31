abstract class Parent{
	void career(){
		System.out.println("Doctor");
	}

	abstract void marry();

}

abstract class Child extends Parent{
         

}
class Child2 extends Child{
	void marry(){
		System.out.println("www");
	}
}

class Client{
	public static void main(String[] args){

		
		Child2 obj1=new Child2();
                obj1.marry();
	}
}

