//Setter and Getter method

class Player{
	private int jerNo=0;
	private String name=null;

        Player(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
		System.out.println("In Constructor: ");  //setter
	}

	void info(){
		System.out.println(jerNo+": "+name);   //getter
	}

}
class Client{
	public static void main(String[] args){
		Player obj1=new Player(18,"Virat");
		obj1.info();
           
		Player obj2=new Player(7,"MSD");
                obj2.info();

		Player obj3=new Player(45,"Rohit");
                obj3.info();
	}
}
