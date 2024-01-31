interface Core2Web{
	void lang(int numCourse);
}

class year2022{
	public static void main(String[] args){

/*		Core2Web c2w=new Core2Web(){
			public void lang(int numCourse){
				System.out.println("Java"+ ":"+numCourse);
				
			}
		};
		c2w.lang(8);
		*/


            Core2Web c2w=numCourse->{

		    System.out.println("Java"+ ":"+numCourse);
   
                };
                c2w.lang(8);
	}
}
