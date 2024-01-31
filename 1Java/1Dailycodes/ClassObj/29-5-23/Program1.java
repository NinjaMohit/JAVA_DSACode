//Hidden this reference

class Demo{
	int x=10;
	
	Demo(){ //Demo(Demo this)
		System.out.println("In No args Constructor");
	}

	Demo(int x){ //Demo(Demo this,int x)

		System.out.println("In Para Constructor");
	      
	}

public static void main(String[] args){
	Demo obj1=new Demo();     //Demo(obj1)
	Demo obj2=new Demo(7);    //Demo(obj2)

}
}
