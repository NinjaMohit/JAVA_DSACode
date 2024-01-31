//Setter and Getter method

class Player{
        private int jerNo=0;
        private String name=null;

        Player(){
                System.out.println("In Constructor: "); 
        }

        void info(int jerNo,String name)
	{
                this.jerNo=jerNo;
                this.name=name;
	       	System.out.println(jerNo+": "+name);   //getter and setter
        }

}
class Client{
        public static void main(String[] args){
                Player obj1=new Player();
                obj1.info(18,"virat");

                Player obj2=new Player();
                obj2.info(7,"MSD");

                Player obj3=new Player();
                obj3.info(45,"Rohit");
        }
}
