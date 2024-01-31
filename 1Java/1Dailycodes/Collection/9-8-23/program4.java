import java.util.*;
class CricPlayer{
int jerNo=0;
String pName=null;

CricPlayer(int jerNO,String pName){
	this.jerNo=jerNo;
	this.pName=pName;
}
}

class HashSetDemo{
	public static void main(String[] args){
		LinkedHashSet hs=new LinkedHashSet();

		hs.add(new CricPlayer(18,"Virat"));
                hs.add(new CricPlayer(7,"MsDhoni"));
	        hs.add(new CricPlayer(45,"Rohit"));
	        hs.add(new CricPlayer(7,"MsDhoni"));

	         System.out.println(hs);
	}
}
