import java.util.*;

class UseListSort{
	public static void main(String[] args){
		ArrayList al=new ArrayList();

		al.add(new Movies("RHTDM",200.00,8.8f));
		 al.add(new Movies("VED",75.00,7.8f));
		  al.add(new Movies("Sairat",100.00,8.0f));
		   al.add(new Movies("Bajrangi",500.00,9.9f));
		   System.out.println(al);

		        Collections.sort(al,new SortByName());
		        System.out.println(al);
		      
		        Collections.sort(al,new SortByName());
		        System.out.println(al);

		        Collections.sort(al,new SortByName());
			System.out.println(al);


	}
}

class Movies{

	String movieName=null;
	double totColl=0.0;
	float imdbRating =0.0f;

	Movies(String movieName,double totColl,float imdbRating){

		this.movieName=movieName;
		this.totColl=totColl;
		this.imdbRating=imdbRating;

	}

	public String toString(){
		return "{ "+movieName+ " "+totColl+" "+imdbRating+ "}";
	}
}

class SortByName implements Comparator{
	public int compare(Object obj1,Object obj2){

		return ((Movies)obj1).movieName.compareTo(((Movies)obj2).movieName);
	}
}
class SortByCall implements Comparator{
        public int compare(Object obj1,Object obj2){

                return (int)((((Movies)obj1).totColl)-(((Movies)obj2).totColl));
        }
}
class SortByIMDB implements Comparator{
        public int compare(Object obj1,Object obj2){

                 return (int)((((Movies)obj1).imdbRating)-(((Movies)obj2).imdbRating));
	
        }
}
