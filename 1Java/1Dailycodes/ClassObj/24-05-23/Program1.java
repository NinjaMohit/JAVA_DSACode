class Demo{
	static {
		System.out.println("Static Block1");
	}
	public static void main(String[] args){
		{
			System.out.println("In Main Demo");
		}
	
	}
}

class client{
	public static void main(String[] args){
		System.out.println("In Client Method");
	}

	static {
		System.out.println("Static Block3");
	}
}


