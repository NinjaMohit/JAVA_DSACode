class StaticDemo{
	static int x=10;
        static int y=20;
	
	static void display(){
		System.out.println(x);
		System.out.println(y);
	}

}
class client{
	public static void main(String[] args){
		System.out.println(StaticDemo.x);//10
            	System.out.println(StaticDemo.y);//20

		StaticDemo.display();//10 20
	}
	}
