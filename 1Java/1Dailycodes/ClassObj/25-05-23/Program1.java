class Demo{
	int x=10;
	Demo(){          //Demo(Demo this)
		System.out.println("In Constructor");
		System.out.println(this);
		System.out.println(this.x);
	}  

	void fun(){      //fun(Demo this)
		System.out.println(this);
		System.out.println(x);
	}

	public static void main(String[] args){

		Demo obj1=new Demo();  //Demo(obj1)

		System.out.println(obj1);
		obj1.fun();
	}
}
