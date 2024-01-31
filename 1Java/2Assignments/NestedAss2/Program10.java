/*
F 5 D 3 B 1 
F 5 D 3 B 1 
F 5 D 3 B 1 
F 5 D 3 B 1 
F 5 D 3 B 1 
F 5 D 3 B 1 

*/

class Program7 {
    public static void main(String[] args) {
      
        for(int i=1;i<=6;i++){
              int num=5;char ch='F';
            for(int j=1;j<=6;j++){
                if(j%2==0){
                    System.out.print(num+ " ");
                    num--;
                    num--;
                }
                else{
                    System.out.print(ch+" ");
                    ch--;
                    ch--;
                }
            }
            System.out.println();
        }
    }
}
