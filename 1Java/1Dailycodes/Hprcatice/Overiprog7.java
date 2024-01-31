//Return type matter in Method overriding for primitive data type


class Demo{
	void fun(){

	}

	int gun(){
		System.out.println("PArent gun");
		return 10;
	}
}
class Child extends Demo{
	char gun(){
		System.out.println("Child gun");
		return 'A';
	}
}
class Client {
	public static void main(String[] args){
		Demo obj=new Child();
		obj.gun();
	}
}


