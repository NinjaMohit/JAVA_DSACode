//Abstraction Real time example

abstract class Bcci{
	Bcci(){
		System.out.println("Bcci");
	}

	void Rules(){
		System.out.println("Rules are same");
	
	}

      abstract	void FormatType();

}
class Ipl extends Bcci{
	void FormatType(){
		System.out.println("Only T20");
	}
}

class Client{
	public static void main(String[] args){
		Bcci Ipl2023=new Ipl();
                    Ipl2023.Rules();
		    Ipl2023.FormatType();
	}
}



