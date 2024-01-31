class Parent{

        Object fun(){
		System.out.println("In parent obj ");
		return new Object();
	}
}
class Child extends Parent{
	String fun(){
		System.out.println("in Child String ");
		return "mohit";

	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Child();
                obj.fun();
	}
}
