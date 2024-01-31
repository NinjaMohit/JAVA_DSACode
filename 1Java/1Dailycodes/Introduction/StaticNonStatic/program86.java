import java.util.*;
class Demo1{
      
	void add(int a,int b){
	      int add=a+b;
	      System.out.println(add);
	}

	void sub(int a,int b){

		int sub=a-b;
		 System.out.println(sub);
	}
	void mul(int a,int b){
		int mul=a*b;
		 System.out.println(mul);
	}



	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
	                int b=sc.nextInt();
                        
	        Demo1 obj=new Demo1();
                obj.add(a,b);
                obj.sub(a,b);
                obj.mul(a,b);		
		        

	}
}
