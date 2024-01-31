class Demo{
	int x=10;
	static int y=20;

	Demo(){
		System.out.println("In Constructor");
	}

	static {
		System.out.println("In static Block1");
	}


	{
		System.out.println("In Instancee Block1");
	}

	public static void main(String[] args){

		System.out.println("In main");
		Demo obj=new Demo();

	//static {
	//		System.out.println("In static Block2");
	//}

	{
			System.out.println("Instance block2");
	}

	}
}
