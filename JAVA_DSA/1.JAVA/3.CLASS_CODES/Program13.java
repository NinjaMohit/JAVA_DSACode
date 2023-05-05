class Maximum{
	public static void main(String[] args){
		int num1=42;
		int num2=32;
		int num3=42;
		if(num1>=num2 && num1>=num3)
		{
			System.out.println(num1+"1 is maximum between 1,2,3");
		}
		else if(num2>=num1 && num2>=num3)
		{

			System.out.println(num2+"is maximum between 1,2,3");
		}
		else{

		System.out.println(num3+"is maximum between 1,2,3");
		}
	}
}
