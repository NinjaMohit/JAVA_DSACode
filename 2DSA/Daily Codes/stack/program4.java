 class Base {
   
      

       public void Print(){
          System.out.println("print");
       }
    }

 
 


class Derived extends Base{
    public void Print(){
        System.out.println("Derived");
    }
}
class Main{
    public static void main(String[] args) {
        Base x=new Base();
        Base y=new Derived();
       x.Print();
       y.Print();
    }
}

