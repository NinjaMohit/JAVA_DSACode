import java.util.*;

class Project{
	String Pname=null;
	int teamSize=0;
	int duration=0;

	Project(String name ,int teamSize,int duration){
		this.Pname=name;
		this.teamSize=teamSize;
		this.duration=duration;
	}

      public	String toString(){
		return Pname;
	}

	public int compareTo(Object obj1){
		return (this.Pname).compareTo((Project)obj1.name);
	}
}
class demo{
	public static void main(String[] args){
	
	
	
		PriorityQueue pq1=new PriorityQueue();

		pq1.offer(new Project("News",3,50));
		pq1.offer(new Project("Edu",2,20));
	        pq1.offer(new Project("Tech",5,10));	
	}}		
