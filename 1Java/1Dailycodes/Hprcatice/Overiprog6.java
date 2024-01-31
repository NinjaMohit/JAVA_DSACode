//return type are not matter in Method overlaoding


class Parent{
	void fun(float x){
		System.out.println(x);
	}

	int fun(int y){
		
                System.out.println(y);
		return y;
	}

	String fun(String str){
                System.out.println(str);
		return str;
	}
	char fun(char ch){
		
                System.out.println(ch);
		return ch;
	}
}
class Client{
	public static void main(String[] args){
		Parent obj=new Parent();
		obj.fun(30.f);
		obj.fun(20);
		obj.fun("Mogit");
		obj.fun('A');
	}
}


