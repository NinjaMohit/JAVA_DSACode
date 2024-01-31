//enumeration

import java.util.*;
class CursorDemo{
	public static void main(String[] args){

		Vector al=new Vector();
		al.add("A");
		al.add("V");
		al.add("S");
		al.add("B");

		Enumeration cursor=al.elements();
		System.out.println(cursor.getClass().getName());

		while(cursor.hasMoreElements()){
			System.out.println(cursor.nextElement());
		}
	}
}

