class Parent{
	Parent(){
		System.out.println("In Parent constructor ");
	}

	void Property(){
		System.out.println("Home ,Gold ,Car ,Bike ");
	}

	void Marry(){
		System.out.println("Alia bhatt ");
	
	
	}

}
class Child extends Parent{
	void Marry(){
		System.out.println("Deepika");
	}
}

class Client{
	public static void main(String[] args){
		Parent p=new Child();
		p.Property();
		p.Marry();
	}
}

