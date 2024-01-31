import java.util.*;
class ArrayListDemo extends ArrayList{
	public static void main(String[] args){
	       ArrayList al=new ArrayList();
            //1 Add(E)
	       al.add(10);
	       al.add(20.5f);
	       al.add("Shashi");
	       al.add(10);
	       al.add(20.5f);

	       System.out.println(al);

	       //2 .Add(int ,E)
	       al.add(3,"Core2web");
               System.out.println(al);

	       //3.size()
	       System.out.println(al.size());
             
               //4.boolean contains();

	       System.out.println(al.contains("Shashi"));
	       System.out.println(al.contains(30));

	       //5.int indexOf();

	       System.out.println(al.indexOf(10));

	       //6.int lastIndexOf();
                System.out.println(al.lastIndexOf(10));

	       //7.E get(int);
	       System.out.println(al.get(3));

	       //8.E set(int,E);
	       al.set(3,"InCUBATOR");
	       System.out.println(al);

	}
}
