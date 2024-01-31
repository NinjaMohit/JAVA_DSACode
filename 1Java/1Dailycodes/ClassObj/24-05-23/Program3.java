class Demo{
	int x=10;

	Demo(){
		System.out.println("In Constructor");
	}

	{
		System.out.println("In Instance block1");
	}

	public static void main(String[] args){
	
		System.out.println("In main");
		Demo obj=new Demo();
	}
	{
		System.out.println("Instance Block2");
	}
}
