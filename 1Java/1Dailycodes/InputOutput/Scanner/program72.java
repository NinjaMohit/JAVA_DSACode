import java.util.Scanner;
class Main {
   public static void main(String[] args){
     Scanner obj=new Scanner(System.in);
 
     String name=obj.next();
     int x=obj.nextInt();
     float y=obj.nextFloat();
     boolean z=obj.nextBoolean();

       System.out.println(name);
       System.out.println(x);
       System.out.println(y);
       System.out.println(z);
   }
}
