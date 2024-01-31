class Demo{
	private int x=10;
	Demo(){
		x=20;
		System.out.println(x);
	}
	Demo(int x){
		this.x=x;
		System.out.println(x);
	}
	void access(){
		System.out.println(x);
	}
public static void main(String[] args){
	Demo obj=new Demo(5);
        obj.access();
}

}
	

