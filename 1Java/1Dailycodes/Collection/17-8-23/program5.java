import java.util.*;

class Demo{
	String str;
	Demo(String str)
	{
		this.str=str;
	}

	public String toString(){
		return str;
            }
	public void finalize(){
		System.out.println("notify");
	}
}

class GCDemo{
	public static void main(String[] args){
		Demo obj1=new Demo("Core2Web");
		Demo obj2=new Demo("Biencaps");
		Demo obj3=new Demo("Incubator");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj1=null;
		obj2=null;

		System.gc();
	}
}

