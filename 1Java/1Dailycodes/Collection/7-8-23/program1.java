import java.util.*;

class CrickPlayer{
	int jerNo=0;
	String name=null;

	CrickPlayer(int jerNo,String name){
		this.jerNo=jerNo;
		this.name=name;
	}

	public String toString(){
		return name;

	}
}

class ArrayListDemo{
	public static void main(String[] args){
		ArrayList al=new ArrayList();

		al.add(new CrickPlayer(18,"Virat"));
		al.add(new CrickPlayer(7,"Dhoni"));
		al.add(new CrickPlayer(45,"Rohit"));

			System.out.println(al.toString());
	}
}
