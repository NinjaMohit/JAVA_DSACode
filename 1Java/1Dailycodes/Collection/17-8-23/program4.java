import java.util.*;

class identityHashMapDemo{

	public static void main(String[] args){

		IdentityHashMap hm=new IdentityHashMap();

		hm.put(new Integer(10),"kanha");
		hm.put(new Integer(10),"Rahul");
		hm.put(new Integer(10),"Bahde");

		System.out.println(hm);
	}
}

