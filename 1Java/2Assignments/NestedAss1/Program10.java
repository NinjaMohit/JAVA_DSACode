/*
1 2 3 4 
2 3 4 5 
3 4 5 6 
4 5 6 7 

*/

 class Program9{
     public static void main(String[] args){
        int num=1;
         for(int i=1;i<=4;i++){
             int num2=num;
             for(int j=1;j<=4;j++){
             System.out.print(num2+" ");
             num2++;
             }
             num++;
         System.out.println();
         }
     }
 }
 
 
 
