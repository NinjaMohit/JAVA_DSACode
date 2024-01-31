//Real time example
//

class Program10{
	public static void main(String[] args){
		float money=15000.00f;

		if(money<=0.00f){
			System.out.println("Do no go outside");
		}
		else if(money>=7000.00f){
			System.out.println("Go outside");
		}
		else if(money>=15000.00f){
			System.out.println("Dine at 5 star");
		}
		else{
			System.out.println("At mess");
		}
	}
}
