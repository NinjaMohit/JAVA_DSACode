import java.util.*;

class HashMapDemo{
	public static void main(String[] args){

		HashSet hs=new HashSet();
		hs.add("Kanha");
		hs.add("Ashish");
		hs.add("Badhe");
		hs.add("Rahul");
		System.out.println(hs);

		HashMap hm=new HashMap();

		hm.put("Kanha","Info");
		hm.put("Ashish","Barclay");
		hm.put("Bahde","CarPro");
		hm.put("Rahul","BMC");

		System.out.println("HashMap"+hm);
	}
}
