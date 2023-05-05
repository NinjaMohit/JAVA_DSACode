class Demo1{
	int x=10;
	int y=20;

	void fun(){
		System.out.println(x);
		System.out.println(y);
		System.out.println(x+y);
	}
	public static void main(String[] args){
		Demo1 obj=new Demo1();

		obj.fun();
	}
}
