import java.io.BufferedReader;
import java.io.*;


 class TwoDArray {
         public static void main(String[] args)throws IOException {
              int arr2[][]={{1,2,3},{4,5},{7}};  //method 1 for declare jagged array
              int arr[][]=new int[3][];          //method 2
             // arr[0]=new int[]{1,2,3};
            //  arr[1]=new int[]{4,5};
            //  arr[2]=new int[]{7};

             arr[0]=new int[3];
             arr[1]=new int[2];
             arr[2]=new int[1];

             BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
              for(int i=0;i<arr.length;i++){
                 for(int j=0;j<arr[i].length;j++){
                     arr[i][j]=Integer.parseInt(br.readLine());
                 }
             }
             

             /*for(int[] x:arr){
                 for(int y:x){
                     y=Integer.parseInt(br.readLine());
                 }
             }

            for(int i=0;i<arr.length;i++){
                 for(int j=0;j<arr[i].length;j++){
                     System.out.print(arr[i][j]);
                 }
                 System.out.println();
             }
*/

             for(int[] x:arr){
                 for(int y:x){
                     System.out.print(y);
                 }
                 System.out.println();
             }

         }
}
