/*
1C3  4B2  9A1  
16C3  25B2  36A1  
49C3  64B2  81A1  
 
 
*/

class Program7 {
    public static void main(String[] args) {
        int num1=1;
        for(int i=1;i<=3;i++){
            char ch2='C';int num2=3;
            for(int j=1;j<=3;j++){
                    System.out.print(num1*num1+""+ch2+""+num2+"  ");
                    
     num1++;
     ch2--;
     num2--;
      }
        
        System.out.println();
    }
}
}
