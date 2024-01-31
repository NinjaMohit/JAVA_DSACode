///Method Overloding realtime example

class Ipl{
	Ipl(){
		System.out.println("Ipl2023");
	}
	void matchInfo(String team1,String team2){
		System.out.println(team1 +" vs "+team2);
	}

	void matchInfo(String team1,String team2, String venue){
		System.out.println(team1 +" vs "+team2 + venue );
	}

	void matchInfo(String team1,String team2,String venue,String Stadname){
		System.out.println(team1 +" vs "+team2 +venue +Stadname);
	}
}
class Client{
	public static void main(String[] args){

		Ipl Ipl2023=new Ipl();
		Ipl2023.matchInfo("GT","CSK");
		Ipl2023.matchInfo("GT","CSK","Ahemdabad");
                Ipl2023.matchInfo("GT","CSK","Ahemdabad","NMStadium");
	}
}
