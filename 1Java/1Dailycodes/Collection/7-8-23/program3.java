//Cursor
import java.util.*;
class IteratorDemo{
	public static void main(String[] args){

		ArrayList al=new ArrayList();

		al.add("Kanha");
		al.add("Rahul");
		al.add("Ashish");

		Iterator itr=al.iterator();

		while(itr.hasNext()){
		        if("Kanha".equals(itr.next())){
		                itr.remove();
			}	
			System.out.print(itr.next());
			}
		}

		//System.out.println(al);
	}

