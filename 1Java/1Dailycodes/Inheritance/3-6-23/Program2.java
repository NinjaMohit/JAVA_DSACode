//Method Overloading

//If class has multiple methods having same name but different in Parameters it is known as Method Overloading
//Return type does not matter in method Overloading


class Demo{

	void fun(int x){                                //int x 
		System.out.println(x);
	}

        void fun(int x){                                //int x same parameter so give error
		System.out.println(x);
            }
     

	public static void main(String[] args){
		
		Demo obj=new Demo();
		obj.fun(2);
		}
}
