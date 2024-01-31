///Meathod Overriding Real time

class BCCI{
	void matchType(){
		System.out.println("T20 / OneDay / Test ");
	
	}
	void Overs(){
		System.out.println("Depends On matchType ");
	}
}

class IPL extends BCCI{
	void matchType(){
		System.out.println("only T20 ");
	}

	void Overs(){
		System.out.println("20 overs ");
	}
}
class Client{
	public static void main(String[] args){
		BCCI Ipl2023=new IPL();
		Ipl2023.matchType();
		Ipl2023.Overs();
	}
}
       


