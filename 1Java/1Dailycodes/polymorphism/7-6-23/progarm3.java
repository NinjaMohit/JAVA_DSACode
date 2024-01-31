//Imp secnario for interview Method Overloading


class Demo{
	void fun(int x,float y){
		System.out.println("Intfloat Parent");
	}

	void fun(float x,int y){
		System.out.println("floatInt Parent");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
		obj.fun(2,3);/// Amibuguity here because it consfuse between int float and float int
	}
}
