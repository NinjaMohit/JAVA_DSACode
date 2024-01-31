//Oveloding realtime example

class Ipl{
	void matchInfo(String team1,String team2){
		System.out.println(team1 +" vs "+team2);
	}

	void matchInfo(String team1,String team2,String venue){
		System.out.println(team1 + " vs "+team2 );
		System.out.println(venue);
	}

	
        void matchInfo(String team1,String team2,String venue,String Sname){
                System.out.println(team1 + " vs "+team2 );
                System.out.println(venue);
		System.out.println(Sname);
        }
}
class Client{
	public static void main(String[] args){
		Ipl Ipl2023=new Ipl();

		Ipl2023.matchInfo("Gt","Csk");
		Ipl2023.matchInfo("Gt","Csk","Ahemdabad");
		Ipl2023.matchInfo("Gt","Csk","Ahemdabad","Narendra modi stadium");
	}
}
