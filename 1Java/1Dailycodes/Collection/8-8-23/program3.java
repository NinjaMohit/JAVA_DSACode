//Cursor
//
import java.util.*;
class CursorDemo{
	public static void main(String[] args){

		ArrayList al=new ArrayList();
            /*
		al.add(10);
		al.add(20.5f);
		al.add(30.5f);
		al.add("C2W");

		for(var x:al){
			System.out.println(x.getClass().getName());
		
		}*/

         //Iterator
	               al.add("Ashish");
		       al.add("kanha");
		       al.add("Rahul");
		       al.add("Bade");

	/*	Iterator cursor=al.iterator();

		while(cursor.hasNext()){
			if("kanha".equals(cursor.next())){
				cursor.remove();
			}
			System.out.println(al);
		}
		*/



	//listIterator
	
		       ListIterator litr=al.listIterator();

		       while(litr.hasNext()){
			       System.out.println(litr.next());
		       }

		      while(litr.hasPrevious()){
			       System.out.println(litr.previous());
		       
		      }

                      while(litr.hasNext()){
                               System.out.println(litr.previous());
                       }
	}
}
