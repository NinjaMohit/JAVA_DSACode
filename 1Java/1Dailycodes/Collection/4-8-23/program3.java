import java.util.*;
class ArrayListDemo extends ArrayList
{
        public static void main(String[] args){

                ArrayListDemo al=new ArrayListDemo();

      
                al.add(10);
                al.add(20.5f);
                al.add("Shashi");
                al.add(10);
                al.add(20.5f);

                System.out.println(al);

	//obj [] toArray();
	//

		Object arr[]=al.toArray();
		for(Object data : arr){
			System.out.print(data+" ");
		}
		System.out.println();

		
	}
}

