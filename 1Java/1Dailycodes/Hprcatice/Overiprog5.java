class Demo{
	/*void fun(String str){
		System.out.println("String");
	}
        void fun(StringBuffer str1){
                System.out.println("StringBuffer ");
	}*/
	void fun(Object obj2){
		System.out.println("Object ");

	}
}

class Client{
	public static void main(String[] args){

	

		Demo obj=new Demo();
		obj.fun("C2W");

         	obj.fun(new StringBuffer("Moh"));

		obj.fun(null);
	}
}
		
