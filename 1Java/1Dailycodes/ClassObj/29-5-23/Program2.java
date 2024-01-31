class Demo{
	int x=10;

	Demo(){
		System.out.println("In Noargs Constructor");
	}

	Demo(int x){
		this();
		System.out.println("In para Constructor");
	}
public static void main(String[] args){
	Demo obj=new Demo(7);


}
}
