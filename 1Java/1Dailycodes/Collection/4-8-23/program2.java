import java.util.*;
class ArrayListDemo extends ArrayList
{
	public static void main(String[] args){

		ArrayListDemo al=new ArrayListDemo();

      //boolean addAll(collection)
		al.add(10);
		al.add(20.5f);
		al.add("Shashi");
		al.add(10);
		al.add(20.5f);

		System.out.println(al);

		ArrayList al2=new ArrayList();
		al2.add("SalluBhai");
		al2.add("SarulhBhai");
		al2.add("AmmirKhan");

		al.addAll(al2);
                System.out.println(al);
//boolean addAll(int ,Collection);
		al.addAll(3,al2);
		System.out.println(al);

//void RemoveRange(int,int)
	        al.removeRange(3,5);
		System.out.println(al);
	}
}


