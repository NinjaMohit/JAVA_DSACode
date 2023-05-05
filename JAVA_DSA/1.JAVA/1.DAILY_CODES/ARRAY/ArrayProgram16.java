class ArrayProgram16{

          int fun(int x){
		  int val=x+30;
		  return val;
	  }

	public static void main(String[] args){
		ArrayProgram16 obj=new ArrayProgram16();

		int ret=obj.fun(10);
		System.out.println(ret);
	}
}


