//Method Overloading
//A Scenario
class Demo{
	void fun(String str){
		System.out.println("String");
	}
	void fun(StringBuffer str1){
		System.out.println("StringBuffer");
	}
}
class Client{
	public static void main(String[] args){
		Demo obj=new Demo();
             
	//String str=null;
	//StringBuffer br=null;
		
	       	obj.fun("Mohit");  //it go to string parameter
		obj.fun(new StringBuffer("Rohit"));  //it goes to StringBuffer parameter
                obj.fun(null);     //it goes both string and stringbuffer So it confuse and give error ambiguty
            
	}
}
