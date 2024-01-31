//Abstraction real time example

 abstract class RBI{
	RBI(){
		System.out.println("Head of all bank");
	}

	void Rules(){
		System.out.println("Same for all");
	}

       abstract	void RateOfInterest();
 }

class SBI extends RBI{
	void RateOfInterest(){
		System.out.println("10 %");
	}
}

class HDFC extends RBI{
	void RateOfInterest(){
		System.out.println("20 %");
	}
}

class Client{
	public static void main(String[] args){

		RBI head1 =new SBI();
		head1.Rules();
		head1.RateOfInterest();

		RBI head2=new HDFC();
		head2.Rules();
		head2.RateOfInterest();
	}
}
